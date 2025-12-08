package test;

public class Car {

	
	public Engine engine;
	
	
	public Car(Engine engine) {
		this.engine = engine;
	}

	public void run () {
		engine.start();
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	
}
