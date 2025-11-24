package ch06;

public class Multi_for {

	public static void main(String[] args) {
		//중첩 for문(다중 for문)
		// for(초기식;조건식;중감식){
		//   반복하고자 하는 명령
		//   for(초기식;조건식;중감식){
		//        반복하고자 하는 명령
		// }
		// 반복하고자 하는 명령
		// }
		
		//for문의 성격
		//1. 초기식 변수에 값을 하아 초기화 한다.
		//2. 변수의 값을 비교허여 조건이 참인지 검증을 한다
		//3. 조건이 참이면 코드블럭({})안의 명령을 실행한다
		//4. 명령을 모두 실행하면 증감식을 실행한다.(초기식 변수의 값이 변화함)
		//5. 변수를 다시 조건과 비교하여 참이면 3-5번 반복, 거칫미면 반복문을 빠져나간나다
		
		for(int i = 1; i<=4; i++) {   // vong i co 3 vong, 
			for(int j =1; j < 4; j++) { // vong j co 3 vong
				System.out.printf("%d일 %d시간\n",i,j);
			} // tong cong vong lap la 9 vong
		} // 
		
		//중첩 for문의 작동 원리
		//1. outer for문이 1회 돌 때, inner for문은 모든 반복을 반복한다.
		//2. inner for문의 모든 반복이 끝나면, outer for문의 증감식으로 돌아온다.
		//3. outer for문의 조건식이 참이면 1-2번 반복, 거짓이면 반복문을 빠져나간다.
		
		System.out.println("------------------------------------------");
		
		//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 코드 작성한다
		//1,5
		//2,4
		//3,3
		//3,3
		//4,2
		//5,1
		for(int i=1; i<7; i++) {
			for(int j=1; j<7; j++) {
				if(i+j == 6) {
				System.out.printf("주사위1 :%d , 주사위2 :%d\n",i,j);
				}
			}
		}
		
		System.out.println("------------------------------------------");
		
		//구구단을 2단부터 9단까지 전부다 출력하기
		for(int i = 2; i<10; i++) {
			for(int j =1; j<10; j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
		
		//for문 -> 배열과 관련이 되게 깊다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
