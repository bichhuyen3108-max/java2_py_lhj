package generics;

public class Main {

	public static void main(String[] args) {
		
		//객체를 만드는 시번에 타입을 결정을 한다
		//제네릭 타입ㅇ,ㄴ 기본생성자료향으,ㄹ 인식하지 암ㄶ는다
		//int,double등의 기본 자료형을 제네릭 타입으로 이용하도자 할 때는
		//Integer,Double등의 클래스를 이용한다
		DataList<Integer> list = new DataList<>();
		//기존생성자 호출되면서 실이가 10인 배열 생성
		list.add(10);
		list.add(20);
		list.add(3.14);
		
		//데이터를 출력
		int sum =0;
		for(int i=0; i<list.size(); i++ ) {
			sum += list.get(i);
		}
		
		//저장돤 데이터 타입이 어떤 타입인지 검사
//		if(data instanceof Integer) {
//			System.out.println("정수: "+ (int)data);
//		}else if(data instanceof Double) {
//			System.out.println("실수: "+ (double)data);
//		}else if(data instanceof String) {
//			System.out.println("문자열: "+ (String)data);
//		
		
		//저장 데이터의 타입이 Object기 때문에 어떤 타입
		//데이터를 사용하기	
		//번거로움이 있다
		
		
		
	}
		
	}


