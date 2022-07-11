package ch06;

public class VIPCustomer extends Customer { // VIP 고객

	double salesRatio; // 할인율
	String agentID; // 담당자
	
	/*
	public VIPCustomer() {
		// super(); // 상속받으면, 컴파일러가 자동으로 디폴트 생성자 호출해줌 // 묵시적 호출
		// super(0, "no-name") // 만약 생성자 불러오기만 해도되면 이렇게 // 명시적 호출
		
		
		bonusRatio = 0.05;
		salesRatio = 0.01;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}*/
	
	public VIPCustomer(int customerID, String customerName) { // 매개변수도 사용하려면 이렇게 // 명시적 호출2
		super(customerID, customerName);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
	}
	
	@Override // 애너테이션. 컴파일러에게 얘는 오버라이드된 메소드라고 알려줌 => 아래 calcPrice()이름이 바뀌면 오류 뜸
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio); // 소수점일 수 있으니까 (int)로 처리
		return price;
	}

	public String getAgentID() {
		return agentID;
	}
	

}
