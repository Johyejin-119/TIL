package ch15;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		System.out.println("=================");
		
		// 업캐스팅, 묵시적 형변환 
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		System.out.println("=================");

		Sell seller = customer;
		seller.sell();
		seller.order();
	}

}
