package com.korea.product.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.korea.product.dto.OrderDTO;
import com.korea.product.dto.ProductDTO;
import com.korea.product.model.ProductEntity;
import com.korea.product.persistence.OrderRepository;
import com.korea.product.persistence.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {
	private final OrderRepository orderRepository;
	private final ProductRepository productRepository;
	
	//주문내역 조회하기
	
	public List<OrderDTO> getAllOrderTotalPrices() {
		//select한 결과를 List에 담는다
		List<Object[]> results = orderRepository.findAllOrderTotalPrice();
		
		//toListOrderDTO(): List<Object[]> -> List<OrderDTO>
		return results.stream()
                .map(result -> OrderDTO.builder()
                        .orderId(((int) result[0])) // orderId
                        .productName((String) result[1]) // productName
                        .productCount(((int) result[2]))// productCount
                        .productPrice(((int) result[3]))// productPrice
                        .totalPrice(((int) result[4])) // totalPrice
                        .orderDate(((String) result[5]))// orderDate 변환
                        .build())
                .collect(Collectors.toList());
	}

	//주문하기 기능
	public List<ProductDTO> save(OrderDTO dto) {
		//productID, productCount;
		
		//1. 상품의 본재 여부를 먼저 확인
		Optional<ProductEntity> option = productRepository.findById(dto.getProductId());
		ProductEntity productEntity;
		if(option.isPresent()) {
			productEntity = option.get();
		}else {
			throw new IllegalArgumentException("상품을 첮을 수 있다");
		}
		
		//재고가 있는지 확인
		if(productEntity.getStock() < dto.getProductCount()) {
			
		}
	}

	

}
