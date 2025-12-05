package com.korea.product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="product")
@Builder
@Data
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private int id;
	private String name;
	private int price;
	int stock;
	private String description;

}
