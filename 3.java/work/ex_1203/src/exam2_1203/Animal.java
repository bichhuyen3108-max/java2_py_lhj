package exam2_1203;

public class Animal {

	void sound() {
		System.out.println("동물이 소리를 냅니다");
	}

}

class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}


class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("야웅");
	}
}
