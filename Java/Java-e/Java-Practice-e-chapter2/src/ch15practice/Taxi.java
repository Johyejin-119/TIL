package ch15practice;

public class Taxi { // �ý�
	String company;
	int passengerCount;
	int money;
	
	public Taxi(String company) {
		this.company = company;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	} 
	
	public void showTaxiInfo() {
		System.out.println(company + "�� ������ " + money + "�� �Դϴ�.");
		System.out.println("-----");
	}
	

}
