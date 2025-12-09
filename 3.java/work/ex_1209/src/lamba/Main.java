package lamba;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class User{
	String name;
	public User() {}
	public User(String name) {this.name = name;};
}
public class Main {

	public static void main(String[] args) {
		
		//인터페이스 활용
		
		
		// cách1
		//람다식을 통한 구현
		//함수를 볌수에 널을 수 있다
		//Dùng biến chứa lamba. Khi muốn tái sử dụng, gọi nhiều lần
		MyCalculator c3 = (num1, num2) -> num1+num2;
		System.out.println("(람다식) 두 수의 합: "+ c3.plus(10,7));
		
		//cách 2
		//메서드의 매개변수로 람다식 전달하기
		//result(c3); 람다식을 포함하고 있는 변수를 전달
		result((num1,num2) -> num1+num2); //람다식을 인자로 전달
		
		//매개변수 없고 반환값이 있을 때
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println("램덤값: "+ randomValue.get());
		
		Consumer<String> printer = msg -> System.out.println("메시지: "+ msg);
		printer.accept("Hello lamba");
		
		//변환하는 역할을 쓸 때 좋다
		Function<String,Integer> lengthFunc = s -> s.length();
		System.out.println("문자열의 길이 :"+ lengthFunc.apply("banana"));
		
		//매개변수가 있고 boolean타입으로 반환
		Predicate<Integer> isEven = n -> n%2 ==0;
		System.out.println(isEven.test(10));
		System.out.println(isEven.test(11));
		
		//cách viết ngắn hơn của lamba
		
		Consumer<String> printer1 = s -> System.out.println( s);
		Consumer<String> printer2 = System.out::println;
		printer1.accept("hello");
		printer2.accept("Hello");
		
		//정적메소드의 참조
		//클래스명::정적매서드명
		Function<String,Integer> parse1= s -> Integer.parseInt(s);
		Function<String,Integer> parse2= Integer::parseInt;
		System.out.println(parse1.apply("100"));
		System.out.println(parse2.apply("100"));
		
		//특정객체의 메서드 참조
		//참조변수::메서드
		String prefix = "[LOG]";
		Consumer<String> logger1 = msg -> System.out.println(prefix + msg);
		Consumer<String> logger2 = System.out::println;
		logger1.accept("Hello");
		logger2.accept("Hello");
		
		//임의의 객체 메서드를 참조
		//클래스명::메서드명
		Function<String,String> toUpper1 = s -> s.toUpperCase();
		Function<String,String> toUpper2 = String::toUpperCase;
		System.out.println(toUpper1.apply("hello"));
	    System.out.println(toUpper2.apply("hello"));
	      
	      //생성자 참조
	      //클래스명::new
	    Supplier<User> userSupplier1 = () -> new User();
	    Supplier<User> userSupplier2 = User::new;
	    
	    User u1 = userSupplier2.get();
		
		//매개변수를 받는 생성자 참조
	    Function<String, User> userCreate1 = name -> new User(name);

	    Function<String, User> userCreate2 = User::new;

	    User u2 = userCreate2.apply("홀길동");
	    System.out.println(u2.name);
	    
	    //람다가 이미 있는 메서드를 그대로 호출하는 역할만 할 때 ::로 줄이는 것이 좋다
		
		
		IntCalculator<Integer> add = (x, y) -> x + y;
		System.out.println("합: "+ add.calc(10,5));
		
		IntCalculator<Integer> sub = (x, y) -> x/y;
		System.out.println("sub: "+ (double)sub.calc(10,5));
		
		IntCalculator<Integer> mul = (x, y) -> x*y;
		System.out.println("div: "+ mul.calc(10,5));
		
	}



	//람다식은 매개변수로 전달하거나, 변환값으로 사용할 수 있다
	//Truyền lambda trực tiếp. Khi dùng 1 lần, code ngắn gọn	

	public static int result(MyCalculator lamba) {
		return lamba.plus(1, 2);
	
	
	
}

}