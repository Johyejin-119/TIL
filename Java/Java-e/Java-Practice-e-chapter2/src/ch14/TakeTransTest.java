package ch14;
//James�� Tomas�� ���� ������ ����ö�� Ÿ�� �б��� ���ϴ�.
//James�� 5000���� ������ �־���, 100�� ������ Ÿ�鼭 1000���� �����մϴ�.
//Tomas�� 10000���� ������ �־���, �ʷϻ� ����ö�� Ÿ�鼭 1200���� �����մϴ�.
//
//�� �л��� ������ ����ö�� Ÿ�� ��Ȳ�� ������ ���ô�.
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
