package ch03;

public class Customer { // 일반 고객

	protected int customerID; 
	protected String customerName;
	protected String customerGrade;
	int bonusPoint; 
	double bonusRatio;
	
	/*고객 내용*/
/*	public Customer() {
		customerGrade = "SIVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() call");
	}*/
	
	// 디폴트 생성자 대신 이런 메소드를 만든다면?  =>  VIPCustomer.java(상속받는 하위클래스)에서 디폴트 생성자 호출할 때 오류 => 해당 클래스에서 명시적으로 호출해야함
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SIVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) call");

	}
	
	
	public int calcPrice(int price) { 
		bonusPoint += price * bonusRatio;
		return price; 
	}
	
	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	
}
