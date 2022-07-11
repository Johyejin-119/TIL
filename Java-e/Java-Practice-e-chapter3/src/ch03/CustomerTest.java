package ch03;

public class CustomerTest {

	public static void main(String[] args) {
/* 디폴트 생성자 없을 때, 명시적 호출 */
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println("================================"); 

		VIPCustomer vipCustomerCho = new VIPCustomer(20010, "VIP홍길동");
		vipCustomerCho.bonusPoint = 10000;
		System.out.println(vipCustomerCho.showCustomerInfo()); 
		
		// 묵시적 형 변환, 타입 변환
		Customer jj = new VIPCustomer(12345, "noname"); 
		// Customer로 형 변환이 되었기 때문에 Customer 타입만 사용가능 => VIPCustomer 쓰고싶다면 오버라이딩 또는 다시 캐스팅 해야함
		// VIPCustomer jj2 = new Customer(12345, "noname"); // 부모가 자식 객체를 참조하는 것은 불가능

		
		
/* 디폴트 생성자 있을 때, 묵시적 호출
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		
		VIPCustomer vipCustomerCho = new VIPCustomer();
		vipCustomerCho.setCustomerName("VIP홍길동");
		vipCustomerCho.setCustomerID(20010);
		vipCustomerCho.bonusPoint = 10000;
		System.out.println(vipCustomerCho.showCustomerInfo()); */
		
		
	}

}
