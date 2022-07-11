package ch24;

import java.util.ArrayList;

public class Student {
	int studentId;
	String studentName;
	
	ArrayList<Subject> subjectList;
	
	
	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	
		subjectList = new ArrayList<>();
	}
	// 학생마다 배열이 따로따로 잡힘
	public void addSubject(String name, int point) {
		Subject subject = new Subject();
		subject.setName(name); // 과목이름
		subject.setScorePoint(point); // 과목 점수
		
		subjectList.add(subject);
	}
	
	public void showScoreInfo() {
		int total = 0;
		
		for(Subject subject : subjectList) { // subjectList를 전체적으로 돌면서 꺼내오는 함수
			total += subject.getScorePoint(); // 과목 점수들의 합=총점
			System.out.println(studentName + "학생의 " + subject.getName() + "과목의 성적은 " + subject.getScorePoint() + "입니다.");
		}
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
	}

}
