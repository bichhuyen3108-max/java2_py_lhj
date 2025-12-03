package exam2_1203;

public class Student extends Person{
	
	String major;

	public Student(String name, int age,String major) {
		super(name, age);
		this.major= major;
	}
	
	@Override
	void introduce() {
		System.out.println("안녕하세요, 저는 "+name+"이고 "+age+"살, 전공은 "+ major+"입니다.");
	}
	
	
	
	

}
