package exam;

public class Main {

	public static void main(String[] args) {
		Playable p = new MusicPlayer();
		p.play();
		
		
		Printable p1 = new DocumentProcessor();
		p1.print();
		
		Sortable s = new DocumentProcessor();
		s.sort();
		
		
		NotificationService service = new NotificationService();
		//첫번째 인자로 Email,SMS객체를 전달
		EmailSender email = new EmailSender();
		SmsSender sms = new SmsSender();
		//두번째 인자로 메시지를 전달
		service.notifyUser(email,"회원가입을 축하합니다");
		service.notifyUser(sms,"인증번호 입력하세요 ");
		
		
		Payservice ps = new Payservice();
		CardPayment card = new CardPayment();
		KakaoPayPayment kakao = new KakaoPayPayment();
		ps.processPayment(card,5000);
		ps.processPayment(kakao,10000);
		
				
		
		
		
		
		
		
	}

}
