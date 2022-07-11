package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new Customer(10020, "James");
		Customer customerE = new GoldCustomer(10030, "Edward");
		Customer customerP = new GoldCustomer(10040, "Percy");
		Customer customerK = new VIPCustomer(10050, "Kim");
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
	/*	for(Customer customer : customerList) { // 고객별 등급을 알 수 있다.
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("================================");
		
		int price = 10000;
		for(Customer customer : customerList) { // 고객마다 다른 지불 값, 보너스 포인트 값을 알 수 있다.
			
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이" + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님이 현재 보너스 포인트는 " + customer.bonusPoint + "입니다.");
				
		}*/
		

		// 컴파일에러는 안남 => VIPCustomer와 (VIPCustomer)가 서로 같은지만 보기 때문
		// 그렇지만 실행 에러 => customerE는 GoldCustomer 타입이기때문에
		VIPCustomer vs = (VIPCustomer) customerE;
		
		// 이렇게하면 실행 잘되지만, 결과는 빈 화면 뜸
		// instanceof : customerE(해당 변수/인스턴스)가 VIPCustomer타입의 변수인가? 라고 확인해주는 것 => 시스템 다운 방지
//		if(customerE instanceof VIPCustomer) {
//			VIPCustomer vs = (VIPCustomer) customerE;
//		}
		
	}

}
