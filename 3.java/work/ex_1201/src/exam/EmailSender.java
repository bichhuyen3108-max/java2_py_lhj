package exam;

public class EmailSender implements MessageSender {

	@Override
	public void send(String msg) {
		System.out.println("이메일 발송 <"+ msg+">");
	}

	
}
class SmsSender implements MessageSender{

	@Override
	public void send(String msg) {
		System.out.println("SMS 발송 <" +  msg+ ">");
		
	}
	
	
}

//Email로 보내건 SMS 보내던지간에 방법은 잘 모르겠다
//"전송은 해줄게"하는 역할만 한다
class NotificationService {
	
	public void notifyUser(MessageSender sender, String msg) {
		//아떤 종류의 전달받식의 모더라도 둘 다 send()메서드를 사용한다
		sender.send(msg);
		
	}
}