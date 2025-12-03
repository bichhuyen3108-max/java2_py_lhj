package exam2_1203;

public class Main {

	public static void main(String[] args) {
		
		//5번
		
		Student s = new Student("홍길동",20,"컴퓨터공학");
		s.introduce();
		
		//6번
		
		Animal[] animals= {new Animal(), new Dog(),new Cat()};
		
		for(Animal a : animals) {
			a.sound();
		}
		
		//7번
		Shape[] shapes = {new Rectangle(4, 5),new Circle(3)};
		     for (Shape s1 : shapes) {
		            System.out.println("넓이: " + s1.area());
		     }
		     
		//8번
		Movable mov = new Car();
		mov.move(10, 20);
		
		//10번
		SavingsAccount save = new SavingsAccount("후엔",100000);
		save.withdraw(30000);
		save.withdraw(80000);
		
		
		

	}

}
