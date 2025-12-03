package exam2_1203;

public class Car implements Movable{

	int x;
	int y;
	
	public Car() {
		
	}

	@Override
	public void move(int x, int y) {
		System.out.println("자동차가 (" +x+","+y +") 위치로 이동했습니다");
	}
	

}
