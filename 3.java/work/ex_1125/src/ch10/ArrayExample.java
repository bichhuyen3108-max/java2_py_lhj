package ch10;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExample {

	public static void main(String[] args) {
		// Arrays클랙스
		//배열의 복사,정렬,검색 등
		//배열을 다루기 위한 다양한 메서드를 가지고 있다.
		
		
		//Scanner,Random 클랙스에 있는 기능을 가져다 쓸 때
		
		//Arrays는 객체의 생성 없이 호출해서 쓸 수 있다
		//static -> 객체의 생성없이 호출하는 것이 가능하다.
		//클랙스에 붙어있는 변수를 만들거나, 메서드를 만들 때 붙이는 키워드 
		//메모리에 무조건 한본만 올라간다
		
		//toString
		//배열의 출력
		
		int[] arr = {10,7,8,6,4,2,9,1,3};
		System.out.println(Arrays.toString(arr));

		//sort
		//배열의 정렬
		//오른차순
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//내림차순
		//Comparator.reverseOrder()
		// 기본타입의 배열로는 불가능하다
		//기본자료형의 클래스타입의 필요하다. -> Wrapper 클래스
		Integer[] ar = {1,6,3,2,10,7,5,9,4,8};
		
		Arrays.sort(ar,Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		//배열의 복사
		//자바에서 배열은 한 번 샹성하면 길이 변경헐 수 없다
		// 더 많은 데이터를 저장해야 하거나 기본의 배열과 같은 배열을 만드려면 
		//배열을 복사해야 한다
		
		//얕은 복사(Shallow copy) ( bi anh huong khi thay doi mang goc)
		int[] arr01 = {1,2,3};
		
		int[] arr02 = arr01; // bat buoc phai de bien arr02 = arr01 de ca 2 cung dia chi
		
		System.out.println("arr202 배열: "+ Arrays.toString(arr02));
		
		arr01[1] = 20; 
		
		System.out.println("arr202 배열: "+ Arrays.toString(arr02));
		
		//깊은 복사 ( khong bi anh huong khi ban goc thay doi)
		//반복문을 이용해서 새로운배열에 값을 직접 넣거나
		//Arrays클래스 또는 System 클래스가 가진 기능을 이용한다
		
		int[] cards = {1,6,4,5,3,2};
		int[] newCards = new int[cards.length];
		
		System.out.println(Arrays.toString(cards));
		
		//1. 반복문을 이용한 깊은 복사
		for(int i =0; i< cards.length;i++) {
			newCards[i] = cards[i];
		}
		 System.out.println(Arrays.toString(newCards));
		
		//Arrays클래스를 이용한 깊은복사
		int[] newCards2 = Arrays.copyOf(cards,cards.length);
		System.out.println(Arrays.toString(newCards2));
		
		cards[1] = 100;
		System.out.println(Arrays.toString(cards));
		System.out.println(Arrays.toString(newCards));
		System.out.println(Arrays.toString(newCards2));
		
		
		
		
		
		
		
		
		
		
		

	}

}
