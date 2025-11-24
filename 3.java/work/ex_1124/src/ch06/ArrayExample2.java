package ch06;

import java.util.Random;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 길이가 3인 비어있는 정수형 배열을 생성
		int[] arr = new int [3];
		
		System.out.println(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("arr[%d]: %d\n",i,arr[i]);
		}
		
		String [] sArr = new String[3];
		
		for(int i =0; i< arr.length; i++) {
			System.out.printf("sArr[%d]: %s\n",i,sArr[i]);
		}
		
		//배열의 길이
		//배열을 생성했을 때 대괄호 안에 배열의 길이를 작성해ㅆ다.
		//배열은 내부적으로 length라는 변수를 지니는데, 해당 변수는 벼열의
		//길이값을 가지고 있다
		//배열의 길이를 알고 싶을 때는 배열명.length를 하면 된다.
		
		//길이 10의 정수형배열을 만든다
		//변수 이름은 numbers
		//배열의 10개의 난수를 집어넣는다 (1~30)
				//배열 안에서 모든 짝수의 합 구하기
		int[] numbers = new int [10];
		int sum = 0;
		
		for (int j =0; j<numbers.length;j++) {
			numbers[j]= new Random().nextInt(30)+1;
			if(numbers[j] % 2 == 0) {
				sum += numbers[j];
			}
		}
		for (int j =0; j<numbers.length;j++) {
			System.out.println(numbers[j]+ "");
		}
		
		System.out.println("모든 짝수의 총합: "+sum);
		
		//정렬
		//베열의 값이 순서 없이 저장되는 경우, 배열의 값을 오름차순으로 정렬해주세요;
		int[] arr2 = {1,6,2,10,5,8,4,3,9,7};
		for (int i=0; i< arr2.length; i++) {
			for(int j=0; j< arr2.length; j++) {
				if(arr2[j] > arr2[j+1]) {
				int temp = arr2[j];
				arr2[j] = arr2[j+1];
				arr2[j+1] = temp;
				
			}
		}
		for(int n : arr2)
			System.out.println(n + " ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
