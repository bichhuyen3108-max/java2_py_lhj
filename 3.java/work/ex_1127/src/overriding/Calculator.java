package overriding;

public class Calculator {

		//메소드 선언
		public double areaCircle(double r) {
			System.out.println("부모클래스 베서드 실행");
			return 3.14 * r * r;
		}
}
