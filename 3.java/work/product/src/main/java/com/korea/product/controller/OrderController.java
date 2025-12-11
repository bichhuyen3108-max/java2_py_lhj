package com.korea.product.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.dto.OrderDTO;
import com.korea.product.dto.ResponseDTO;
import com.korea.product.service.OrderService;

import lombok.RequiredArgsConstructor;
@RestController
@RequiredArgsConstructor
@RequestMapping("order")
public class OrderController {
	
	private final OrderService orderService ;
	
	@GetMapping("/total")
	public ResponseEntity<?> getAllOrderTotals(){
		List<OrderDTO> list = orderService.getAllOrderTotalPrices();
		ResponseDTO<OrderDTO> response = ResponseDTO.<OrderDTO>builder()
													.data(list)
													.build();
		return ResponseEntity.ok().body(response);
	}
	
	
	
	
	
	

}
