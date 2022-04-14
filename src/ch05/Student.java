package ch05;
// 6강 예제임
public class Student {

		// 각 멤버변수는 null, o으로 자동으로 초기화
		public int studentNumber;
		public String studentName;
		public int grade;
	
		//디폴트 생성자 -> 생성자가 하나도 없을 때 만들어진다. StudentTest.java 7줄 코드
		public Student() {} 
		
		public Student(int studentNumber, String studentName, int grade) { // 학생 정보를 매개변수로 받아서 초기화할 때
			this.studentNumber = studentNumber; // 내 멤버변수에 매개변수를 넘겨줌
			this.studentName = studentName;
			this.grade = grade;
		}
		
		public String showStudentInfo() {
			return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
		}

}
