package com.korea.layer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.korea.layer.model.TodoEntity;
import com.korea.layer.persistence.TodoRepository;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j //(Simple Logging Facade or java) 로그를 작성하는 표준 인테피이스 제공
@Service
//스프링프레임워크에서 제공하는 어노케이션 중 하나로 서비스 레이어에
//사용되는 클래스를 명시할때 사용
//이 어노케이션으로 사용하묜 스프링부트가 해단 클래스를 스프릴 컨테이너에서
//관리하는 빈(bean)으로 동록하도 비즈니스 로직을 처리하는 역할을 맡는다
@RequiredArgsConstructor
public class TodoService {

	//TodoRepository를 생성자 주입받기
	private final TodoRepository repository;
	
	public String testService() {
		//build패턴으로 TodoEntity객체를 하나 만든다.
		//title: My First Todo item
		TodoEntity entity = TodoEntity
				.builder()
				.userId(null)
				.title("My First Todo item")
				.build();
		//TodoEntity를 db에 저장한다
		repository.save(entity);
		
		//저장된 데이터 찾기
		//findById의 반환형 Optional
		//Optional "null"이 들어올 수 있는 겂을 안전하게 감싸는 박스
		//값이 없으면 예외 발생, 값아ㅣ 있으면 정상 반환
		TodoEntity savedEntity = repository.findById(entity.getId())
			.orElseThrow(() -> new RuntimeException("데이터 없음"));
		
//		Optional<TodoEntity> optional = repository.findById(entity.getId());
//		
//		TodoEntity savedEntity = null;
//		//isPresent(): 반환된 optional 객체 안에 존재하면 true, 없으면 false
//		if(optional.isPresent()) {
//			savedEntity = optional.get();
//		}

		return savedEntity.getTitle();
	
	}
	
	public List<TodoEntity>create(TodoEntity entity) {
		//1. 매개변수로 넘어온  Entity가 유효(null인지 아닌지)한지 검사한다
		//null이면 RuntimeException("Entity cannot be null")
		if(entity == null) {
			log.warn("Entity cannot be null");
			throw new RuntimeException("Entity cannot be null");
		}

		//1-1. userId가 null이면 RunTimeException("Unknown User")에러 발생
		//2. db에 저장한다.
		if(entity.getUserId() == null) {
			log.warn("Unknown User");
			throw new RuntimeException("Unknown User");
		}
		
		repository.save(entity);
		
		//3. 해당 유저가 추가한 todo item을 모두 조회하여 반환(1건이 아날수도 있음)
		//findByUserId()를 사용할 것
		log.info("Entity Id : {} is saved", entity.getId());
		
		return repository.findByUserId(entity.getUserId());
		
	}
}
