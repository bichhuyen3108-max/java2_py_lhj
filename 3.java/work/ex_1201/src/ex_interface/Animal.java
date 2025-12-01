package ex_interface;

//"~역할을 하는 클래스가 있다면 이련 메서드는 무조건 있어야 한다
//역할// 규칙의 정의
public interface Animal {
	
	//상속와 추상메서드만 들어갈 수 없다
	//접근제한자가 default인 메소드도 만들 수 있다
	//디폴트 메서드는 body가 존재한다

		void eat();
		void sleep();
}
