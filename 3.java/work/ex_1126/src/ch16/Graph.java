package ch16;

import java.util.Random;

public class Graph {

	public static void main(String[] args) {
		int[] nums = new int[100]; //난수들을 담을 배열
		
		for(int i = 0; i<nums.length; i++) {
			nums[i]= new Random().nextInt(10);
			System.out.print(nums[i]+ " ");
		}
		System.out.println();
		
		int[] count = new int[10];//난수가 몇개씩 나왔는지 담을 배열
		//각 난수가 몇개씩 나왔는지 세기
		for(int i=0; i<nums.length;i++) {
			count[nums[i]]++;
		}
		//count배열을 가지고 그래프 그리고
		
		PrintGraph pg = new PrintGraph();
		for(int i =0; i<count.length;i++) {
			System.out.println(i+"의 갯수: "+pg.print('#',count[i])+" "+ i);
		}
		
		
		
	}

}
