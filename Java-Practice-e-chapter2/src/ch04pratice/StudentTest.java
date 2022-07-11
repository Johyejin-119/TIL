package ch04pratice;

public class StudentTest {

	public static void main(String[] args) {
		Student studentJo = new Student();
		studentJo.studentID = 17422001;
		studentJo.setStudentName("JO");
		studentJo.address = "경기도 수원시";
		
		studentJo.showStudentInfo();

		
		Student studentLee = new Student();
		studentLee.studentID = 17422002;
		studentLee.setStudentName("LEE");
		studentLee.address = "경기도 용인시";
		
		studentLee.showStudentInfo();

	}

}
