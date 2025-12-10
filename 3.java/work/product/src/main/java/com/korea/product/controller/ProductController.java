package com.korea.product.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dto.ProductDTO;
import com.korea.product.dto.ResponseDTO;
import com.korea.product.model.ProductEntity;
import com.korea.product.service.ProductService;

@RestController
@RequestMapping("product")
@CrossOrigin(originPatterns = "*", allowCredentials = "false")
public class ProductController {

	private final ProductService service;
	
	public ProductController(ProductService service) {
		this.service = service;
	}
	
	// 상품 초회 
	@GetMapping
	public ResponseDTO<?> productList(){
		List<ProductEntity> entities = service.retrieve();
		
		List<ProductDTO> dtos = entities.stream()
							.map(ProductDTO::new)
							.collect(Collectors.toList());
		
		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		return response;
	}

	// 상품 추가 API
	@PostMapping("/createProduct")
	public ResponseEntity<?> createProduct(@RequestBody ProductDTO dto){
		try {
			
			//DTO -> Entity
			ProductEntity entity = ProductDTO.toEntity(dto);
			
			entity.setId(null);
			
			//서비스 레이어의 create메서드를 호출해서, ProductEntity를 데이터베이스에 저장하는 작업을 한다.
			List<ProductEntity> entities = service.create(entity);
			
			//Entity List - > DTO List
			List<ProductDTO> dtos = entities.stream()
								.map(ProductDTO::new)
								.collect(Collectors.toList());
			ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
			
			return ResponseEntity.ok().body(response);	
		} catch ( Exception e) {
			String error = e.getMessage();
			ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().error(error).build();
			return ResponseEntity.ok().body(response);	
		}
		
	}
	
	
	
	
	
	
	
}
