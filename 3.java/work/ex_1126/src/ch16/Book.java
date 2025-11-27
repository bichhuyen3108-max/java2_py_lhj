package ch16;

public class Book {
	
	//필드
	String title;
	String author;
	
	//생성자
	//생성자를 호출할 때 전달된 제목과 저자를 매개변수로 받아서
	//필드를 초기화 시키기 
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	//메서드
	//책을
	public void printInfo() {
		System.out.println("제목 : " + this.title + " ,저자 : " + this.author + "\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
