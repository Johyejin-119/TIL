package ch15practice;

public class Airplane {
	String company; // �װ����̸�
	int passengerCount; // �°� ��
	int money; // ��� 
	int seatCount; // �� �¼� ��
	
	public Airplane(String company) {
		this.company = company;
	}
	
	public void take(int money) {
		this.money += money; // �װ��簡 ���� ��
		passengerCount++;
		seatCount++;
	}
	
	
	public void showAirplaneInfo() {
		System.out.println(company + "�� �°� ����" + passengerCount + "��, �¼���" + seatCount +"�� á����, ������ " + money + "�� �Դϴ�.");
		System.out.println("-----");
	}

}
