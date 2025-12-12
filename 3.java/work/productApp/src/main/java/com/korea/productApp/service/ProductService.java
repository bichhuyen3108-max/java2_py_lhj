package com.korea.productApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.korea.productApp.model.ProductEntity;
import com.korea.productApp.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
@RequiredArgsConstructor

public class ProductService {
	
	private final ProductRepository productRepository;
	
	public void validate(ProductEntity entity) {
		if(entity==null) {
			log.warn("Entity cannot be null");
			throw new RuntimeException("Entity cannot be null");
		}
		
		if(entity.getName()==null) {
			log.warn("Unknown");
			throw new RuntimeException("Unknown");
		}
		
		if(entity.getPrice() < 0) {
			log.warn("상품 가격은 0원 이상이어야 합니다.");
			throw new RuntimeException("상품 가격은 0원 이상이어야 합니다.");
		}
		if(entity.getStock() <0) {
			log.warn("상품 재고는 0개 이상이어야 합니다.");
			throw new RuntimeException("상품 재고는 0개 이상이어야 합니다.");
		}
		
	}

	public List<ProductEntity> addProduct(ProductEntity entity) {
		validate(entity);
		
		productRepository.save(entity);
		
		return productRepository.findAll();
	}
	

	public List<ProductEntity> findProduct(ProductEntity entity) {
		
		return productRepository.findAll();
	}
	
	
	
	public ProductEntity findProductById(int id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("해당 ID의 상품이 존재하지 않습니다. id=" + id));
    }
	
	
	
	
	public List<ProductEntity> updateProduct(ProductEntity entity) {
		validate(entity);
		Optional<ProductEntity> original = productRepository.findById(entity.getId());
		
		if(original.isPresent()) {
			
			ProductEntity product = original.get();
			
			product.setName(entity.getName());
			product.setPrice(entity.getPrice());
			product.setStock(entity.getStock());
			productRepository.save(product);
		}
		
		return productRepository.findAll();
	}

	public List<ProductEntity> delete(ProductEntity entity) {
		validate(entity);
		try {
			productRepository.deleteById(entity.getId());
		} catch (Exception e) {
			log.error("Error deleting entity",entity.getId(),e);
			throw new RuntimeException("Error deleting entity"+entity.getId());
		}
		return productRepository.findAll();
	}

	

	
	
	
	
	



}
