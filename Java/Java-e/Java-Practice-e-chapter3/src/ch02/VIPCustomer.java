package ch02;

public class VIPCustomer extends Customer { // VIP ��
	/* ��� ������ �� �ʿ� ����
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint; // package default (�������� �Ẹ������ �ϴ�)
	double bonusRatio;
	*/
	
	double salesRatio; // ������
	String agentID; // �����
	
	
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
