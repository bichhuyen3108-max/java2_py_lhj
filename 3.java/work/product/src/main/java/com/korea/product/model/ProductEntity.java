package com.korea.product.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="Product")


public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	
	private Integer id;
	private String name;
	private Integer stock;
	private Integer price;
	@CreationTimestamp //LocalDateTime 등록날짜
	private LocalDateTime createdAt;
	
	@UpdateTimestamp	//LocalDateTime 수정날짜
	private LocalDateTime updatedAt;
	
}
