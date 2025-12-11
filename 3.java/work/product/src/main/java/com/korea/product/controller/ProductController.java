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

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor // không cần tạo 생성자 cho ProductController
@CrossOrigin(originPatterns = "*", allowCredentials = "false")
public class ProductController {

	//ProductService 주입
	private final ProductService service;
	
	
	// 상품 초회 
	@GetMapping
	public ResponseEntity<?> productList(){
	    List<ProductEntity> entities = service.findAll();
//		List<ProductDTO> dtos = entities.stream()
//							.map(ProductDTO::new)
//							.collect(Collectors.toList());
//		
//		ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
		return eToDTO(entities);
	}

	//사용자가 전달한 데이터를 받아서 db에 저장
	// 상품 추가 API
	@PostMapping("/createProduct")
	public ResponseEntity<?> createProduct(@RequestBody ProductDTO dto){
		
			//인자로 넘어온 dto를 ProductDTO.toEntity()메서드를 이용해서 ProductEntity 타입으로 변환
			//DTO -> Entity
			ProductEntity entity = ProductDTO.toEntity(dto);
			
			
			//서비스 레이어의 create메서드를 호출해서, ProductEntity를 데이터베이스에 저장하는 작업을 한다.
			List<ProductEntity> entities = service.create(entity);
			
//			//Entity List - > DTO List
//			List<ProductDTO> dtos = entities.stream()
//								.map(ProductDTO::new)
//								.collect(Collectors.toList());
//			ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder().data(dtos).build();
//			//eToDTO메소드를 호출면서 db에서 가져혼 데이터들아 담긴 List를 만자로 전달한다
			return eToDTO(entities);
		
		
	}
	
	
	
	
	
	
	//db에서 넘어온 데이터이 들어있응 list를 매개변수로 전달받는다
	private static ResponseEntity<?> eToDTO(List<ProductEntity> entities){
		//리스트에서 스트림을 생성하고
	    List<ProductDTO> dtos = entities.stream()
	    					//map을 통해서 ProductEntity타입의 데이터을 ProductEntity
	                        .map(ProductDTO::new)
	                        .collect(Collectors.toList());

	    ResponseDTO<ProductDTO> response = ResponseDTO.<ProductDTO>builder()
	                        .data(dtos)
	                        .build();

	    return ResponseEntity.ok().body(response);
	}
	
	
	
	
	
	
	
}
