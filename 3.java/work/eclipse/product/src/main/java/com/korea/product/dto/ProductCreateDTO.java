package com.korea.product.dto;

import lombok.Data;

@Data
public class ProductCreateDTO {

	String name;
	int price;
	int stock;
	String description;
	
}
