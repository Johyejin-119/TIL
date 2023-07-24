package ch06;

public class VIPCustomer extends Customer { // VIP ��

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
		salesRatio = 0.1;
		customerGrade = "VIP";
		
	}
	
	@Override // �ֳ����̼�. �����Ϸ����� ��� �������̵�� �޼ҵ��� �˷��� => �Ʒ� calcPrice()�̸��� �ٲ�� ���� ��
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio); // �Ҽ����� �� �����ϱ� (int)�� ó��
		return price;
	}

	public String getAgentID() {
		return agentID;
	}
	

}
