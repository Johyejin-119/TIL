package ch03;

public class VIPCustomer extends Customer { 
	


// VIP 고객
	/* 상속 받으면 쓸 필요 없음
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint; // package default (여러가지 써보기위해 일단)
	double bonusRatio;
	*/
	
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
		salesRatio = 0.01;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer(int, String) call");
	}
	
	public String getAgentID() {
		return agentID;
	}
	

}
