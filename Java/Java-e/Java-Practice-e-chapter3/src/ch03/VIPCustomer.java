package ch03;

public class VIPCustomer extends Customer { 
	


// VIP ��
	/* ��� ������ �� �ʿ� ����
	private int customerID;
	private String customerName;
	private String customerGrade;
	int bonusPoint; // package default (�������� �Ẹ������ �ϴ�)
	double bonusRatio;
	*/
	
	double salesRatio; // ������
	String agentID; // �����
	
	/*
	public VIPCustomer() {
		// super(); // ��ӹ�����, �����Ϸ��� �ڵ����� ����Ʈ ������ ȣ������ // ������ ȣ��
		// super(0, "no-name") // ���� ������ �ҷ����⸸ �ص��Ǹ� �̷��� // ����� ȣ��
		
		
		bonusRatio = 0.05;
		salesRatio = 0.01;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}*/
	
	
	public VIPCustomer(int customerID, String customerName) { // �Ű������� ����Ϸ��� �̷��� // ����� ȣ��2
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
