package ch02;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int majorCode;
	public String majorName;
	public int grade;
	
	public void showStudentInfo() {
		System.out.println(studentNumber + " 학번을 가진 " + studentName + " 학생은 " + majorName + " 강의를 수료하였다. ");
	}
	
	public void showMajorInfo() {
		System.out.println("이 학생이 수료한 " + majorName + " 강의 코드는 " + majorCode + "이고, 성적은 " + grade + "등 이다.");
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