package ch16;

public class Library {

	Book[] books;
	int count;
	
	//배열의 길을 받아 배열을 생성, count는 0으로 초기화 하기
	public Library(int size) {
		books = new Book[size];
		count = 0;
	}
	public void addBook(String title, String author) {
		if(count == books.length) {
			System.out.println("더 이상 책을 추가할 수 없습니다");
			return;
		}
		
		books[count] = new Book(title,author);
		System.out.printf("책 추가: "+ title+ "저자: 추가 " + author);
		
	}
		public void printAllBooks() {
			for(int i =0; i<count; i++) {
				books[i].printInfo();
			}
			
	}

}
