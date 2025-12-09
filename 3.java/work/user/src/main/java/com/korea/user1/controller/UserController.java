package com.korea.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.user1.dto.ResponseDTO;
import com.korea.user1.dto.UserDTO;
import com.korea.user1.model.UserEntity;
import com.korea.user1.service.UserService;

@RestController
@RequestMapping
public class UserController {
	@Autowired
	private UserService service;
	
	@PostMapping
	public ResponseEntity<?> createUser(@RequestBody UserDTO dto){
		
		UserEntity entity = UserDTO.toEntity(dto);
		
		List<UserEntity> entites = service.create(entity);
		
		
		List<UserDTO> dtos = new ArrayList<>();
		
		for(UserEntity e : entites) {
			dtos.add(new UserDTO(e));
		}
		
		ResponseDTO<UserDTO> response = ResponseDTO.<UserDTO>builder().data(dtos).build();
		return ResponseEntity.ok().body(response);
		
	}
}
