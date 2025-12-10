package com.korea.product.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;


import com.korea.product.model.ProductEntity;
import com.korea.product.persistence.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {

	private final ProductRepository  productRepository;

	public List<ProductEntity> create(ProductEntity entity) {
		if(entity == null) {
			log.warn("Entity cannot be null");
			throw new RuntimeException("Entity cannot be null");
		}
		if(entity.getName() == null) {
			throw new RuntimeException("상품 이름이 필수합니다");
		}
		if(entity.getPrice() < 0) {
			throw new RuntimeException("가격가 0 이상이어야다");
		}
		if(entity.getStock() <0) {
			throw new RuntimeException("재고가 0 이상이어야다");
		}
		productRepository.save(entity);
		
		return productRepository.findAll();
	}

	public List<ProductEntity> retrieve() {
		
		return productRepository.findAll();
	}
	
	
}
