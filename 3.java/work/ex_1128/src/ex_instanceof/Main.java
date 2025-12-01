package ex_instanceof;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Student s = new Student("홍길동",10);
		
		//instanceof 
		//객체가 특정 타입이 맞는지 확인하는 연산자
		//맞으면 true, 아니면 false를 변환한다
		if(s instanceof Student) {
			System.out.println("s은 Student 타입입니다.");
		}else {
			System.out.println("s객체은 Student 타입이 아닙니다.");
		}

	}

}
