package package1;

public class B {

	public void method() {
		//같은 패키지 있기 때문에 필드,메소드,생성자에 접근이 가능하다.
		A a = new A();
		a.field = "value";
		a.method();
				
		
	}
}
