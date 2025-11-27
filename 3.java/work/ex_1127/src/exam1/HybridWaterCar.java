package exam1;

public class HybridWaterCar extends HybridCar{
	int waterGague;

	public HybridWaterCar(int gasolineGague, int eletricGague,int waterGague) {
		super(gasolineGague, eletricGague);
		this.waterGague = waterGague;
	}
	@Override
	public void showCurrentGague() {
		super.showCurrentGague();
		System.out.println("잔여 물의양: "+waterGague);
	}

	
	
	
	
	
	
	
	
}
