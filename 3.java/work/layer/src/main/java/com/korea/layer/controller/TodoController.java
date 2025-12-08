package com.korea.layer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.layer.dto.ResponseDTO;
import com.korea.layer.dto.TodoDTO;
import com.korea.layer.model.TodoEntity;
import com.korea.layer.service.TodoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("todo")

public class TodoController {
	//해야할 일 api 만들것이다
	
	@Autowired //필드 주입
	//스프링 컨테이너가 실행할 때 TodoService타입의 빈을 찾아서 service 필드에 넣어준다
	private TodoService service; //null
	
	//public TodoController(TodoService service){
	//		this.service = service;
	//}
	
	 
	//setter주입
	//Setter를 통해 주입하는 방식
//	public void setService(TodoService service) {
//		this.service = service;
//	}
	
	//localhost:8080/todo/test
	@GetMapping("/test")
	public ResponseEntity<?>testTodo() {
		String str =service.testService(); //testService()메서드를 실행해서
		List<String> list = new ArrayList<String>();
		list.add(str);
		
		//builder패턴을 이용해서 list를 ResponseDTO에 담아서 ResponseEntity로 반환한다
		ResponseDTO<String> response = ResponseDTO.<String>builder().data(list).build();
		return ResponseEntity.ok().body(response);
	}
	
	@PostMapping
	public ResponseEntity<?> createTodo(@RequestBody TodoDTO dto){
		try {
			//로그인 기능이 없기 때문에 임시 유저
			String tempraryUserId = "temporary-user";
			
			//DTO -> Entity
			TodoEntity entity= TodoDTO.toEntity(dto);	
			
			//엔티티거 세로운 데이터임을 보장
			entity.setId(null);
			
			//엔티티에 임시 유저 아이디 셋팅
			entity.setUserId(tempraryUserId);
			
			//서비스 레이어의 create메서드를 호출해서, TodoEntity를 데이터베이스에 저장하는 작업을 한다
			//저장을 한 다음 TodoEntity객체들을 저장한 List를 반환한다
			List<TodoEntity> entites = service.create(entity);
			
			List<TodoDTO> dtos = new ArrayList<>();
			
			//리스트 안에 들어있는 TodoEntity를 TodoDTO 타입으로 변경해서 dtos애 넣는다
			for(TodoEntity e : entites) {
				dtos.add(new TodoDTO(e)); //entity를 dto로 바꿔서 리스트에 추가
			}
			//builder패턴을 이용해서 dtos를 ResponseDTO에 담아서 ResponseEntity로 반환한다
			
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
			return ResponseEntity.ok().body(response);
			
		}catch (Exception e) {
			String error = e.getMessage();
			ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().error(error).build();
			return ResponseEntity.ok().body(response);
		}
	}
	
	 	//생성된 모든 할 일을 조회하는 retrieveTodoList메서드 만들기
	   //어떤 한 유저가 만든 할일에 대해서 모두 조회
	   //임시유저 : temporary-user
	   //@GetMapping
	
	   @GetMapping
	   public ResponseEntity<?> retrieveTodoList(){
	      //임시 유저 아이디
	      String temporaryUserId = "temporary-user";
	      
	      //서비스레이어의 retrieve메서드를 이용해 Todo리스트를 반환받아 entities리스트에 저장한다.
	      List<TodoEntity> entities = service.retrieve(temporaryUserId);
	      
	      //List에 들어있는 Entity들을 DTO로 변환한다.
	      List<TodoDTO> dtos = new ArrayList<TodoDTO>();
	      
	      for(TodoEntity e : entities) {
	         dtos.add(new TodoDTO(e));
	      }
	      
	      //ResponseDTO객체에 담는다.
	      ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
	      
	      //ResponseEntity로 반환한다.
	      return ResponseEntity.ok().body(response);
	   }
	
	   //할일을 수정하기 위해 updateTodo메서드 작성하기
	   //수정하려는 내용을 사용자로부터 받아서 처리
	   //임시유저 : temporary-user
	   //update from Todo set title="수정할내용" done = true, where =?
	   @PutMapping
	   public ResponseEntity<?>updateTodo(@RequestBody TodoDTO dto){
		   //임시유저 생성
		   String temporaryUserId = "temporary-user";
		   
		   //dto를 Entity로 변환
		   TodoEntity entity = TodoDTO.toEntity(dto);
		   
		   entity.setUserId(temporaryUserId);
		   
		   //entity
		   // id: xxxxx
		   //userId: temporary-user
		   //title: 수정하려고 하는 내용
		   //done : true
		   
		   List<TodoEntity> entities = service.update(entity);
		   
		 //List에 들어있는 Entity들을 DTO로 변환한다.
		   List<TodoDTO> dtos = new ArrayList<>();
		   
		   for(TodoEntity e : entities) {
		         dtos.add(new TodoDTO(e));
		      }
		 //ResponseDTO객체에 담는다.
		   ResponseDTO<TodoDTO> response = ResponseDTO.<TodoDTO>builder().data(dtos).build();
		   
		 //ResponseEntity로 반환한다.
		   return ResponseEntity.ok().body(response);
	   }
	   
	   //delete() 메서드 만들기
	   //넘어온 entity가 유호한지 검사
	   //유호하면 삭제 후 전체 조회를 해서  반한
	   //delete from Todo where id = ?
	   
	   @DeleteMapping
	   public ResponseEntity<?>deleteTodo(@RequestBody TodoDTO dto){
		   
		 //임시유저 생성
		   String temporaryUserId = "temporary-user";
		   
		   // DTO -> Entity 변환 để gửi xuống Service xử lý
		   
		  TodoEntity entity = TodoDTO.toEntity(dto);
		  
		   
		  //원래 entity에 돌아가는것
		  //id
		  //userId
		  //title
		  //done
		  
		  //service로 넘기는 entity
			// Service 호출해서 삭제 + 전체 리스트 반환 받기
		    List<TodoEntity> entities = service.delete(entity);
		    
		    
		    //List에 들어있는 Entity들을 DTO로 변환한다.
		      List<TodoDTO> dtos = new ArrayList<TodoDTO>();
		      
		      for(TodoEntity e : entities) {
		         dtos.add(new TodoDTO(e));
		      }
		   
	   }
	   
	   
	   
	
	
	
	
}
