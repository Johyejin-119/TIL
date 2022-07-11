package ch02;

public class VIPCustomer extends Customer { // VIP 고객
	/* 상속 받으면 쓸 필요 없음
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint; // package default (여러가지 써보기위해 일단)
	double bonusRatio;
	*/
	
	double salesRatio; // 할인율
	String agentID; // 담당자
	
	
	public VIPCustomer() {
		
		bonusRatio = 0.05;
		salesRatio = 0.01;
		customerGrade = "VIP";
	}
	
	public String getAgentID() {
		return agentID;
	}
	
//	public void setAgentID(String agentID) {
//		this.agentID = agentID;
//	}
}
