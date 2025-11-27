package ch16;

import java.util.Scanner;

public class Exam1 {
	
	//1.배열의 최대값을 찾는 maxFinder메서드 만들기
	//최대값을 찾아서 반환하기
//	public int maxFinder(int[] arr) {
//		int max = 0; 
//		for(int i: arr) {
//			if (i > max) {
//				max = i;
//			}
//		}
//		return max;
//	}

	static double pi = 3.141592;
	//2.원의 넓이를 구하는 circleArea메서드 만들기
	//원의 넓이 : 3.14*r*r
	//반환하기
	double circleArea(double r ) {
		return pi * r * r;
	}
	
	//3.원의 돌레를 구하는 circleRound메서드 만들기
	//원의 돌레: 2*3.14*r
	//출력하고 끝나기
	double circleRound(double r) {
		return 2 * pi * r;
	}
	
	//4.화씨를 섭씨로 바꾸는 fToc
	//섭씨 : (화씨-32)/1.8
	//함수를 실행하면 온도를 입력받아서 출력하기
	public void fToc() {
		Scanner sc = new Scanner(System.in);
		double faher;
		System.out.println("화씨를 입력하세요: ");
		faher = sc.nextDouble();
		
		double cel = (faher-32)/1.8;
		System.out.println("섭씨온도로 반환: "+ cel);
	}
	
	//5.숫자 두개와 연산자를 매개변수로 받아서 사칙연산을 하는 calc메서드 만들기
	//매개변수 : 정수 2개, 문자열 1개
	
	public int calc(int n1, int n2, String str) {
		if(str.equals("+")) {
			return n1+ n2;			
		} else if(str.equals("-")) {
			return n1 - n2;	
		}else if(str.equals("*")) {
			return n1 * n2;	
		}else if(str.equals("/")) {
			return n1 / n2;	
		}else {
			System.out.println("연산기호 올바르지 않습니다");
			return -1; // co loi xay ra toan tu ko hop le
		}
	}
	
	
	
	
	
}
