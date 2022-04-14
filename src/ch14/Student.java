package ch14;

public class Student {

		String studentName; // 학생 이름
		int money; // 학생이 가지고 있는 돈
		
		public Student(String studentName, int money) { 
			this.studentName = studentName; 
			this.money = money;		
		}
		
		public void takeBus(Bus bus) { // Student에서 bus가 매개변수로 넘어옴
			bus.take(1000); // bus 인스턴스에 대해 take()함수가 불려짐
			this.money -= 1000;
		}
		
		public void takeSubway(Subway subway) {
			subway.take(1200);
			this.money -= 1200;
		}
		
		public void showInfo() {
			System.out.println(studentName + "님의 남은 돈은" + money + "원 입니다.");
		}
}
