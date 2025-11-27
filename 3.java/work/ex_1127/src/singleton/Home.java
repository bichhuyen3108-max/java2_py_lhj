package singleton;

public class Home {

	public static void main(String[] args) {
		
		//생성자 private이라서 객체 생성이 불가능함
		//Remocon remocon = new Remocon();
		
		//리모컨이 필요함
		//static으로 정의된 필드나 메서드는 객체 생성없이 호출이 가능하다
		//클래스명.메서드명() 형태로 메서드를 호출할 수 있다
		
		Remocon r1= Remocon.getInstance();
		Remocon r2= Remocon.getInstance();
		
		System.out.println(r1);
		System.out.println(r2);
		
		//여러 군데에서 같이 써야 하고, 여러개 존재하면 오히려 문제를 일으키는 것을 
		//싱글톤 팬턴으로 정의한다
		
		//db접속/ 리소스를 권리
		//많은 사람이 게시판에 글을 쓴다.(insert)
		//사름들마다 db접속 객체를 만들게 되면 메모리에 부하가 온다
		//db접속 갹체를 여려개를 만들어 두고 순차적으로 사용하도록 만든다.
		
		//스프링은 모든 객체를 싱글톤으로 권리한다
		//메모리에 딱 한번반 올린다
		
		//실글톤으로 관리하면 안되는것들
		//user객체 -> 한명이 수정하면 모든 사람이 같이 수정됨
		//장바구니 객체
		//사람마다 달라야 하는 걸정값 -> 언어, 라이트 다크 태마, 개인정보
	}

}
