package ch24practice;

import java.util.ArrayList;

public class Student {

	int studentId;
	String studentName;
	ArrayList<Subject> subjectList = new ArrayList<>();
	
	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void addSubject(String subName, int subScore) {
		Subject sub = new Subject();
		sub.setName(subName);
		sub.setScore(subScore);
		
		subjectList.add(sub);
	}
	
	public void showScoreInfo() {
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + "�л��� " + subject.getName() + "������ ������ " + subject.getScore() + "�Դϴ�.");
		}
		System.out.println(studentName + "�л��� ������ " + total + "�Դϴ�.");
	}
}
