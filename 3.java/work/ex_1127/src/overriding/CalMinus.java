package overriding;

public class CalMinus extends Calculator2 {
	
	@Override
	public int getResult(int x, int y) {
		return x-y;
	}
}
