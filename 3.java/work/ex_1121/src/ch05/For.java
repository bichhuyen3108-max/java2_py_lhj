package ch05;
import java.util.Scanner;
public class For {

	public static void main(String[] args) {
		//1 부터 10까지 출력하는 for문 작성하기
		//근데 가로로 출력하기
		// 1 2 3 4 5 6 7 8 9 10
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		
	//10부터 1까지 출력하는 for문 작성하기;
		for(int i=10; i>=1; i--) {
			System.out.print(i + " ");
		}
		
		//1부터 10까지 3의 배수만 출력하기
		for (int i=1; i<=10; i++) {
			if(i % 3 == 0) System.out.println(i);
		}
		
		//1부터 10까지 총합구하기
		int sum = 0;
		for (int i=1; i<=10; i++) {
		sum += i;
			System.out.println("총합:"+ sum);
		}
		
		//키보드에서 숫자아나를 입력받고 구구단 출력하기
		// 5 * 1 = 5
		// 5 * 2 = 10
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수: ");
		int n1 = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.printf("결과: %d * %d = %d\n",n1,i,n1*i);
		}
		
				//키보드에서 숫자 두개를 입력받아서
			System.out.println("x: ");
			int x = sc.nextInt();
		
			System.out.println("y: ");
			int y = sc.nextInt();
		
		//x부터 y까지 총 합 구하기
		
		//x가 y보다 크다면 값을 서로 교환해서 총합 구하기
		if(x>y) {
			int temp = x;
			x = y;
			y = temp;
		}
		int total = 0;
		for(int i=x; i<= y; i++) {
			System.out.println("총 합: " + total);
		}
		
		// 1~ 20까지의 정수 중 2의 배수가 아니면서 3의 배수가 아닌 수의 총합을 구하세요
		// int sum2 = 0;
		//for(int i=1; i<=20; i++) {
			//if(i % 2 != 0 && i % 3 != 0) {
				//sum2 += i;
				//System.out.println("총합: "+ sum2);
		//	}
			
	//	}
		
		//int 타입의 num 변수에 12345를 대입한다
		//각 자리수의 합을 구한 결과를 출력하는 코드 작성한다
		// 1 + 2 + 3 +4 +5 = 15
		int num3 = 12345;
		int sum3 = 0;

		while(num3 > 0) {
		    sum3 += num3 % 10;   // lấy chữ số cuối
		    num3 = num3 / 10;    // bỏ chữ số cuối
		}

		System.out.println("총합: " + sum3);

			
		// 1 + (1+2) +(1+2+3)+(1+2+3+4)+....(1+...+10)의 결과를 계산한다
		int total5 = 0;
		sum = 0;
		for (int i=1; i<=10;i++) {
			sum += i;// 1+2+3
			total5 += sum; // 1 + (1+2) + (1+2+3)...
		}
		
		
		
	}

}
