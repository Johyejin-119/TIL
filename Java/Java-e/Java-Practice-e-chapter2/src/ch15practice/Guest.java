package ch15practice;

public class Guest {  // 손님
//	앞의 예제에서 Edward는 지각을 해서 택시를 타야 했습니다. 
//	20000원을 가지고 있었는데 10000원을 택시비로 사용했습니다.
//	택시는 '잘나간다 운수' 회사 택시를 탔습니다.
	String guest;
	int money;
	
	public Guest(String guest, int money) {
		this.guest = guest;
		this.money = money;
	}

	public void takeTaxi(Taxi taxi) {
		taxi.take(10000); // 택시에게 주는 요금
		this.money -= 10000;
	}
	
	public void takeAirplane(Airplane airplane) {
		airplane.take(150000);  // 항공사에게 주는 요금
		this.money -= 150000;
		
	}
	
	public void showGuestInfo() {
		System.out.println(guest + "님의 남은 돈은 " + money + "원 입니다.");
	}
	


}
