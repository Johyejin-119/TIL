package ch14;

public class Student {

		String studentName; // �л� �̸�
		int money; // �л��� ������ �ִ� ��
		
		public Student(String studentName, int money) { 
			this.studentName = studentName; 
			this.money = money;		
		}
		
		public void takeBus(Bus bus) { // Student���� bus�� �Ű������� �Ѿ��
			bus.take(1000); // bus �ν��Ͻ��� ���� take()�Լ��� �ҷ���
			this.money -= 1000;
		}
		
		public void takeSubway(Subway subway) {
			subway.take(1200);
			this.money -= 1200;
		}
		
		public void showInfo() {
			System.out.println(studentName + "���� ���� ����" + money + "�� �Դϴ�.");
		}
}
