package ch04pratice;

public class Student {
	public int studentID;
	public String studentName;
	public String address;

	public void showStudentInfo() {
		System.out.println(studentID + " 학생의 이름은 " + studentName + "이고, 사는 곳은 " + address + "입니다.");
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String Name) {
		studentName = Name;
	}
}
