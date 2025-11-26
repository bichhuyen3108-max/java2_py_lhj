package ch15;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer com = new Computer();
		
		int result = com.sum(1,2,3); // cach 1
		System.out.println("result: "+ result);
		
		int[] values = {1,2,3,4,5}; // cach 2
		
		result = com.sum(values);
		System.out.println("result: "+ result);
		

	}

}
