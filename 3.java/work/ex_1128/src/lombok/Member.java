package lombok;

@Getter //모든 필드에 대해 getter 메서드 만들어줌
@Setter // 모든 필드에 대해 setter 메서드 만들어줌
@NoArgsConstructor   //기본생성자
@AllArgsConstructor  //모든 필드를 매개변수로 갖는 생성자
@RequiredArgsConstructor  // @NonNull, final로 지정된 필드만 매개변수로 갖는다
@Data  //getter,setter,RequiredArgsConstructor를 한번에 지정햐주는 어노테이션
@Builder  //setter메서드가 필요 없다.
//Builder라는 내부틀래스를 만들고 그 안에 필드와 setter
//역할을 하는 메서드를 만든다
public class Member {

	@NonNull
	private Long id;
	private String name;
	private String email;
	
}
