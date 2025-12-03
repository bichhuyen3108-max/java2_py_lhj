package exam2_1203;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(String owner, int balance) {
		super(owner, balance);
	}
	
	@Override
	void withdraw(int amount) {
		if(amount <= balance /2 ) {
			balance -= amount;
			System.out.println("잔액:"+balance);
		}else {
			System.out.println( "적금 계좌는 한번에 잔액의 50%만 출금 가능합니다" );		
		}
	}

}
