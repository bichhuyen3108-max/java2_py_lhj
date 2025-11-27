package overriding;

public class CalPlus extends Calculator2{
	
	@Override
	public int getResult(int x , int y) {
		return x + y;
	}
	
	
}
