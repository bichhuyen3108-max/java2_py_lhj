package overriding;

public class Main {

	public static void main(String[] args) {
		
		int r =10;
		Calculator cal = new Calculator();
		cal.areaCircle(r); //부모클랙스에 있는 메서드 실행

		
		Computer c = new Computer();
		c.areaCircle(r);
		
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		System.out.println("CalPlus: "+ cp.getResult(15, 15) );
		System.out.println("CalPlus: "+ cm.getResult(30, 15) );
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
