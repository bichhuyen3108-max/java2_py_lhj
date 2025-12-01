package exam1;

public class Main {

	public static void main(String[] args) {
		
	Animal[] zoo = {new Animal(), new Dog(), new Cat()};
	
	//cach 1
//	for(int i = 0; i< zoo.length; i++) {
//		zoo[i].sound();
//	}
	
	//cach 2
	for(Animal animal : zoo) {
		animal.sound();
	}
	
	//트레이너 객체를 만든다
	AnimalTrainer trainer = new AnimalTrainer();
	
	trainer.train(new Dog());
	trainer.train(new Cat());
		
			

	}

}
