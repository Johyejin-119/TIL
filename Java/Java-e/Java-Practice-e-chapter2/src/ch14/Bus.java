package ch14;

public class Bus {
	int busNumber; // ���� ��ȣ
	int passengerCount; // �°� ��
	int money; // ����
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) { // �л��� take�Լ��� �θ��鼭 ��ü ������ �Ͼ 
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "���� �°� ���� " + passengerCount + "�� �̰�, ������ " + money + "���Դϴ�.");
	}
}
