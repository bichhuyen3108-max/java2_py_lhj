package com.korea.product.service;

import org.springframework.stereotype.Service;

import com.korea.product.dto.ProductCreateDTO;
import com.korea.product.dto.ProductDTO;
import com.korea.product.persistence.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor //생성자 주입

public class ProductService {
	
	private final ProductRepository repository;
	
	public ProductDTO createProduct(ProductCreateDTO responsedto) {
		
		validate(responsedto);
		
	

	private void validate(ProductCreateDTO dto) {
		if(dto.getName() == null || dto.getName().trim().isEmpty()) {
			throw new RuntimeException("상픔 이름은 필수입니다.");
			
		}
		
	}
	

}
