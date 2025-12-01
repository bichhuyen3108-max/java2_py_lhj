package ex_interface;

//MySQL과 연결하는 코드
public class MySQLOrderRepository implements OrderRepository {

	public void save() {
		System.out.println("MySQL 주문내역 저장");
	}
}
