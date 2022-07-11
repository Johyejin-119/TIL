package ch14;

public class Bus {
	int busNumber; // 버스 번호
	int passengerCount; // 승객 수
	int money; // 수입
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) { // 학생이 take함수를 부르면서 객체 협력이 일어남 
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원입니다.");
	}
}
