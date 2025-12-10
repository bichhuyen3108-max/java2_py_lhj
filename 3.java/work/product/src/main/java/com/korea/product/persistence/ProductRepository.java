package com.korea.product.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.korea.product.model.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {


}
