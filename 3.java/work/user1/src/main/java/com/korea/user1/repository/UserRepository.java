package com.korea.user1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.user1.model.UserEntity;

@Repository
public interface  UserRepository extends JpaRepository<UserEntity,Integer> {

	//- 이메일을 통해 유저를 찾는 findByEmail추상메서드 추가하기
	//(반환 타입은 UserEntity)

	List<UserEntity> findByEmail(String email);
	
}




