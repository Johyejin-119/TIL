package ch04;

public class StudentTest {

	public static void main(String[] args) {

		// 클래스 Student가 데이터 타입! 클래스는 딱히 데이터 크기가 정해져있지는 않음
		// new Student()는 생성자
		// 하나에 여러개의 인스턴스(studentLee, studentKim) 생성 가능
		// 인스턴스마다 각기 다른 studentID, address란 멤버변수를 가짐
		
		Student studentLee = new Student(); 
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		
		Student studentKim = new Student();

		studentKim.studentID = 54321;
		studentKim.setStudentName("Kim");
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();

	}

}
