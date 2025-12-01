package exam;

public interface Payment {
	void pay (int amount);
}

class CardPayment implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("카드로 "+ amount +"원 결제.");
	}
}

class KakaoPayPayment implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("카카오페이로 "+ amount+ "원 결제");
	}
}

class Payservice {
	public void processPayment(Payment payment, int amount) {
		payment.pay(amount);
	}
}