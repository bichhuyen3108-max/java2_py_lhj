package com.korea.user1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.user1.model.UserEntity;
import com.korea.user1.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
	
	private final UserRepository repository;
	
	public List<UserEntity> create(UserEntity entity){
		if(entity == null) {
			log.warn("Entity cannot be null");
			throw new RuntimeException("Entity cannot be null");		
		}
		
		if(entity.getEmail() == null) {
			log.warn("Unknown Email");
			throw new RuntimeException("Unknown Email");
		}
		
		repository.save(entity);
		log.info("Entity Email : {} is saved", entity.getEmail());;
		return repository.findByEmail(entity.getEmail());
		
	}

}
