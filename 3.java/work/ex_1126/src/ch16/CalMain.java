package ch16;

public class CalMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		//길이가 4인 정사각형의 넓이 구하여 출력하기
		double return1 = calc.areaRectangle(4);
		System.out.println("정사각형의 넓이 "+ return1);
		
		// 가로 5, 세로가 10인 직사각형의 넓이를 구하여 출력하기
		double return2 = calc.areaRectangle(5,10);
		System.out.println("직사각형의 넓이 "+ return2);
		
		// static tu 호출, ko can thong qua ai ( hoac co the thong qua 객체 roi 호출 duoc)
		System.out.println(Calculator.pi);
		System.out.println(calc.pi);
	}

}