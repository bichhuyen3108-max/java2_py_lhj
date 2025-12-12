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
@AllArgsConstructor //getter & setter
@Entity
@Table(name="Product")


public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //값을 자동으로 생성
	
	//GenerationType.AUTO: 내부적으로 생성 전략이 선택되는지 JPA 구현체(Hibernate)의 설정과 
	//사용중인 데이터베이스의 종류에 따라 달라진다 -> 사용중인 데이터베이스가 자동증가(Auto-Increment)를 지원하는 확인
	private Integer id;
	private String name;
	private Integer stock;
	private Integer price;
	 //LocalDateTime 등록날짜
	@CreationTimestamp //Insert쿼리가 잘생했을 때 현 시간 값을 적용시켜준다
	private LocalDateTime createdAt;
	//LocalDateTime 수정날짜
	@UpdateTimestamp//Update쿼리가 잘생했을 때 현제 시간 값을 적용시커준다. 값이 없으면 CreationTimestamp같이 생성 시점이 한 번 기록될 수 있다
	private LocalDateTime updatedAt;
	
}
