package ch15practice;

public class Airplane {
	String company; // 항공사이름
	int passengerCount; // 승객 수
	int money; // 요금 
	int seatCount; // 찬 좌석 수
	
	public Airplane(String company) {
		this.company = company;
	}
	
	public void take(int money) {
		this.money += money; // 항공사가 받은 돈
		passengerCount++;
		seatCount++;
	}
	
	
	public void showAirplaneInfo() {
		System.out.println(company + "의 승객 수는" + passengerCount + "명, 좌석은" + seatCount +"개 찼으며, 수입은 " + money + "원 입니다.");
		System.out.println("-----");
	}

}
