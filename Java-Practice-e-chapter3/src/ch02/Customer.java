package ch02;

public class Customer { // 일반 고객

	protected int customerID; // 상위클래스에서는 접근 못하지만 하위클래스(ex. VIPCustomer)에서는 접근 가능하도록 protected
	protected String customerName;
	protected String customerGrade;
	int bonusPoint; // package default (여러가지 써보기위해 일단)
	double bonusRatio;
	
	/*고객 내용*/
	public Customer() {
		customerGrade = "SIVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) { // 할인율은 없고 보너스 포인트만
		bonusPoint += price * bonusRatio;
		return price; // 얼마를 샀느냐에 따라 나중에 할인율을 적용할 것
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
