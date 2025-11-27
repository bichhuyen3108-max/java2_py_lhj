package ch16;

public class LibraryMain {

	public static void main(String[] args) {
		Library lib = new Library(3);
		
		// 책 3권을 추가하다
		lib.addBook("자바","홍길동");
		lib.addBook("파이션","김길동");
		lib.addBook("자바립스트","휘엔");
		
		//전체 책 정보 출력하기
		lib.printBook();
		

	}

}
