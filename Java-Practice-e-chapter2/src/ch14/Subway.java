package ch14;

public class Subway {
	int lineNumber; // 지하철 노선
	int passengerCount; // 승객 수
	int money; 
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "호선의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원입니다.");
	}

}
