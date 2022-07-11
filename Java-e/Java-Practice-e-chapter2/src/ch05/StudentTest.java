package ch05;
// 6강 예제임
public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(); // 생성자를 따로 만들었을 경우엔 오류가 뜨는데 => 해당 클래스(Student.java)에 디폴트 생성자를 만들어주면 된다.
		studentLee.grade=1;
		System.out.println(studentLee.showStudentInfo());
	
		Student studentKim = new Student(123456, "KIM", 3);
		System.out.println(studentKim.showStudentInfo());
		
	}

}
