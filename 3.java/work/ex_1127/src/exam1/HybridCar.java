package exam1;

public class HybridCar extends Car{
	int eletricGague;

	public HybridCar(int gasolineGague, int eletricGague ) {
		super(gasolineGague);
		this.eletricGague = eletricGague;
	}
	
	@Override
	public void showCurrentGague() {
		super.showCurrentGague();
		System.out.println("잔여 전기량:" + eletricGague);
	}
	

}
