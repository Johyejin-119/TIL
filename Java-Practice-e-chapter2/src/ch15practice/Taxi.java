package ch15practice;

public class Taxi { // 택시
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
		System.out.println(company + "의 수입은 " + money + "원 입니다.");
		System.out.println("-----");
	}
	

}
