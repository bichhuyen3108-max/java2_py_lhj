package singleton;

public class Counter {
	//필드로 정수형 타입의 count를 가진다
	//외부에서 new Counter로 객체 생성을 하지 못한다
	//getInstance()메서드로만 객체의 정보를 얻을 수 있다.
	//increment()메서드를 호출하면 count가 1 증가한다.
	//getCount()메서드로 현재 count값을 조회할 수 있다.
	
	//필드로 정수형 타입의 count를 가진다
	private int count;
	
	private static Counter counter = new Counter();

	private Counter() {
		
	}
	
	//getInstance()메서드의 역할
	//만들어진 
	
	//getInstance()메서드로만 객체의 정보를 얻을 수 있다.
  // 접근제한자	   반환타입   메서드명
	public static Counter getInstance() {
		//반환값이 Counter 객체니까 반환타입이 Counter
		return counter;
	}
	
	//increment()메서드를 호출하면 count가 1 증가한다.
	public int increment() {
		count ++;
		return count;
	}
	
	//getCount()메서드로 현재 count값을 조회할 수 있다.
	//반환타입이 정수.
	
	public int getCount() {
		return count;
	}
	
	
	
	
	
	

	

}
