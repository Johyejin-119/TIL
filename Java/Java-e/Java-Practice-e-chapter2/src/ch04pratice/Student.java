package ch04pratice;

public class Student {
	public int studentID;
	public String studentName;
	public String address;

	public void showStudentInfo() {
		System.out.println(studentID + " �л��� �̸��� " + studentName + "�̰�, ��� ���� " + address + "�Դϴ�.");
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String Name) {
		studentName = Name;
	}
}
