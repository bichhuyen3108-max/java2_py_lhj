package com.korea.user1.dto;

import com.korea.user1.model.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UserDTO {
	private int id;
	private String name;
	private String email;
	
	
	// 생성자를 만들기
	//Entity를 DTO타입으로 변환하기  
	 public UserDTO(UserEntity entity) {
		 this.id = entity.getId();
		 this.name = entity.getName();
		 this.email = entity.getEmail();
	 }
	 
	 //DTO를 Entity타입으로 바꾸는 toEntity메서드 만들기
	 public static UserEntity toEntity(UserDTO dto) {
		 return UserEntity.builder()
				 .id(dto.getId())
				 .name(dto.getName())
				 .email(dto.getEmail())
				 .build();
		 
	 }
	 
	 
	 
}
