package ch02;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int majorCode;
	public String majorName;
	public int grade;
	
	public void showStudentInfo() {
		System.out.println(studentNumber + " �й��� ���� " + studentName + " �л��� " + majorName + " ���Ǹ� �����Ͽ���. ");
	}
	
	public void showMajorInfo() {
		System.out.println("�� �л��� ������ " + majorName + " ���� �ڵ�� " + majorCode + "�̰�, ������ " + grade + "�� �̴�.");
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int studentgrade) {
		grade = studentgrade;
	}

}