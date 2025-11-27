package singleton;

public class Main {

	public static void main(String[] args) {
		Counter c1 = Counter.getInstance();
	      Counter c2 = Counter.getInstance();
	      
	      c1.increment();
	      c2.increment();
	      c2.increment();
	      
	      //c1, c2의 count값 조회하기
	      c1.getCount();
	      c2.getCount();
	      System.out.println("c1의 count: "+ c1.getCount());
	      System.out.println("c1의 count: "+ c2.getCount());

	}

}
