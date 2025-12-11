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
		//ProductRepository 주입
	private final ProductRepository  productRepository;
	
		// 상품 초회 
		public List<ProductEntity> findAll() {
			
			return productRepository.findAll();
		}
		
		
		// 상품 추가 API
		//entity를 Controller로 부터 전잘받아서 영속계층으로 전달하여 db애 저장
		
	public List<ProductEntity> create(ProductEntity entity) {
		
		//entity를 Controller로 부터 전잘받아서 영속계층으로 전달하여 db애 저장
		productRepository.save(entity);
		
		//db에 저장된 모든 내용을 조회하여 반환
		return findAll();
	}


	
	
}
