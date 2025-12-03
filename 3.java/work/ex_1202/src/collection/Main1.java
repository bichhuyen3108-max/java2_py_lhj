package collection;
import java.util.ArrayList;
import java.util.Scanner;
public class Main1 {
	
	

	public static void main(String[] args) {
		//정수타입의 ArrayList arr을 만든다.
	      //정수 10,20,30,40,50을 추가한다
	      //모든 요소의 합과 평균을 출력한다
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		System.out.println(arr);
		int sum =0;
		for(int i :arr) {
			sum +=i;
		}
		
		double avg = (double)sum/arr.size();
		System.out.println(avg);
		
		
		//문자열 타입의 ArrayList words를 만든다.
		//문자열들을 추가한다
		//3글자 이상의 문자열들을 longWords라는 ArrayList를 만들어서 저장한다
		//"자바","파이션","C","JavaScript","Go","Oracle"
		ArrayList<String> words = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		words.add(sc.next());
		
		
		ArrayList<String> longWords = new ArrayList<>();
		for(String i : longWords) {
			if(i.length()>=3) {
				longWords.add(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
