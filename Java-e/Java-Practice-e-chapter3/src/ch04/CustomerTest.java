package ch04;

public class CustomerTest {

	public static void main(String[] args) {
/* 디폴트 생성자 없을 때, 명시적 호출 */
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + price);
		
		System.out.println("================================"); 

		VIPCustomer vipCustomerCho = new VIPCustomer(20010, "VIP홍길동");
		vipCustomerCho.bonusPoint = 10000;
		int price2 = vipCustomerCho.calcPrice(1000);
		System.out.println(vipCustomerCho.showCustomerInfo() + price2);
		
		System.out.println("================================"); 
	
		Customer jj = new VIPCustomer(12345, "noname"); // VIPCustome()의 실제 메소드가 호출
		System.out.println(jj.calcPrice(1000));
		
	}

}
