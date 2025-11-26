package ch16;

public class Person {

	static  String NAME;
	static  int AGE;
	
	static { //static과 과련된것들을 초기화 해줄 수 있다.
		//클랙스가 처음 메모리에 올라갈 때 딱 한 번 실행되는 초기화 구간
		//클래스 단위로 한 번만 해야하는 작업을 넣는곳
		NAME = "홍길동";
		AGE = 20;
	}
	
	
	
	
	
	
}
