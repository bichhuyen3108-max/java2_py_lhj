package exam_1203;

public class Main {

	public static void main(String[] args) {
		
		//1번
		Student st1 = new Student("홍길동",20,"컴퓨터공학");
		st1.printInfo();
		
		//2번
		Calculator cal = new Calculator();
		System.out.println(cal.add(5, 6));
		System.out.println(cal.subtract(5, 6));
		System.out.println(cal.multiply(5, 6));
		System.out.println(cal.divide(10, 0));
		
		//3번
		Point p = new Point();
		Point p1 = new Point(3,5);
		p.printPoint();
		p1.printPoint();
		
		//4번
		
		Printer printer = new Printer();
		printer.print(15);
		printer.print(15.5);
		printer.print("자바");
		
		
		//5번
		
		
		
		
		
		
		
		
		
		

	}

}
