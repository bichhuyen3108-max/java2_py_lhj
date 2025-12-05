package com.korea.product.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductDTO {
	
	int id;
	String name;
	int price;
	int stock;
	String description;
}
