package lombok;

public class Main {

	public static void main(String[] args) {
		Member m = new Member();
		m.setId(100L);
		m.setName("홍깅동");
		m.setEmail("이메ㅁ일");
		
		//빌더패턴
		//복잡한 객체를 "조립하듯이" 단계적으로 만드는 다자인 패턴
		//특히 필드가 많고, 선택적인 
		Member m2 = new Member().builder()
			.id(100L)
			.name("박길동")
			.email("이메일2")
			.build();
		
		Student s = new Student().builder()
				.name("김말똥")
				.age(25)
				.phone("010-1111-1111")
				.address("부평구")
				.build();
		
		

	}

}
