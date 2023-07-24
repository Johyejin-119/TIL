package ch15practice;

public class Guest {  // �մ�
//	���� �������� Edward�� ������ �ؼ� �ýø� Ÿ�� �߽��ϴ�. 
//	20000���� ������ �־��µ� 10000���� �ýú�� ����߽��ϴ�.
//	�ýô� '�߳����� ���' ȸ�� �ýø� �����ϴ�.
	String guest;
	int money;
	
	public Guest(String guest, int money) {
		this.guest = guest;
		this.money = money;
	}

	public void takeTaxi(Taxi taxi) {
		taxi.take(10000); // �ýÿ��� �ִ� ���
		this.money -= 10000;
	}
	
	public void takeAirplane(Airplane airplane) {
		airplane.take(150000);  // �װ��翡�� �ִ� ���
		this.money -= 150000;
		
	}
	
	public void showGuestInfo() {
		System.out.println(guest + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
	


}
