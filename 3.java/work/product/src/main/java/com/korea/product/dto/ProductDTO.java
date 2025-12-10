package com.korea.product.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.korea.product.model.ProductEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ProductDTO {
	
	private Integer id;
	private String name;
	private Integer stock;
	private Integer price;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
	//Entity를 DTO타입으로 변환하기
	public ProductDTO(ProductEntity entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.stock = entity.getStock();
		this.price = entity.getPrice();
		this.createdAt = entity.getCreatedAt();
		this.updatedAt = entity.getUpdatedAt();
	}
	
	//DTO를 Entity타입으로 바꿈 toEntity메서드를 만들기
	public static ProductEntity toEntity( ProductDTO dto) {
		return ProductEntity.builder()
				.id(dto.getId())
				.name(dto.getName())
				.stock(dto.getStock())
				.price(dto.getPrice())
				.build();
	}
	


}
