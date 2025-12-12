package com.korea.productApp.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.korea.productApp.dto.ProductDTO;
import com.korea.productApp.dto.ResponseDTO;
import com.korea.productApp.model.ProductEntity;
import com.korea.productApp.repository.ProductRepository;
import com.korea.productApp.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
@CrossOrigin(originPatterns = "*", allowCredentials = "false")
public class ProductController {
	
	private final ProductService service;
	
	//상품등록
	@PostMapping("/createproduct")
	ResponseEntity<?> createProduct(@RequestBody ProductDTO dto){
		
		ProductEntity entity = ProductDTO.toEntity(dto);
		
		List<ProductEntity> entities = service.addProduct(entity);
		
		return eToDTO(entities);
		
		
	}
	
	//전체 조회
	@GetMapping
	ResponseEntity<?> getProduct( ProductDTO dto){
		ProductEntity entity = ProductDTO.toEntity(dto);
		
		List<ProductEntity> entities = service.findProduct(entity);
		
		return eToDTO(entities);
		
	}
	
	// 조회 id
	@GetMapping("{id}")
	ResponseEntity<?> getId(@PathVariable int id){
		
			ProductEntity entity = service.findProductById(id);
				
			List<ProductEntity> entities = List.of(entity);
				
			return eToDTO(entities);
	}
	
	//
	@PutMapping("{id}")
	ResponseEntity<?> modifyProduct(@RequestBody ProductDTO dto){
		ProductEntity entity = ProductDTO.toEntity(dto);
		
		List<ProductEntity> entities = service.updateProduct(entity);
		
		return eToDTO(entities);
	}
	
	@DeleteMapping("{id}")
	ResponseEntity<?> deleteProduct(@PathVariable Integer id){
		
		ProductEntity entity = ProductEntity.builder()
								.id(id)
								.build();
			
		List<ProductEntity> entities = service.delete(entity);
			
			return eToDTO(entities);
			
	}
	
	
	
	
	private static ResponseEntity<?> eToDTO(List<ProductEntity> entities){
		
	    List<ProductDTO> dtos = entities.stream()
	                        .map(ProductDTO::new)
	                        .collect(Collectors.toList());

	    ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder()
	                        .data(dtos)
	                        .build();

	    return ResponseEntity.ok().body(response);
	    
	}
	

}
