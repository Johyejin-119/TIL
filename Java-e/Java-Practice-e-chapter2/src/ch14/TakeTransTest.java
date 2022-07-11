package ch14;
//James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
//James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
//Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.
//
//두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.
public class TakeTransTest {
	
	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		studentJ.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		studentT.takeSubway(greenSubway);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		greenSubway.showSubwayInfo();
	
		bus500.showBusInfo();

	}

}
