package wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		
		//자동 포장이 일어난다.
		//기본타입 100이 Integer객체 된다
		Integer obj = 100;
		System.out.println("value: "+ obj.intValue());
		
		int value = obj;
		System.out.println("value: "+ value);
		
		Integer obj2 = 300;
		Integer obj3 = 300;
		
		System.out.println(obj2 == obj3); //객체는 주소를 비교하기 때문에 False
		System.out.println(obj2.equals(obj3));
	}

}
