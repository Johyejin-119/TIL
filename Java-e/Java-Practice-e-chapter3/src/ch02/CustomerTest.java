package ch02;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer vipCustomerCho = new VIPCustomer();
		vipCustomerCho.setCustomerName("VIP홍길동");
		vipCustomerCho.setCustomerID(20010);
		vipCustomerCho.bonusPoint = 10000;
		System.out.println(vipCustomerCho.showCustomerInfo()); 
	}

}
