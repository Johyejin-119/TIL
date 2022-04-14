package ch24practice;

public class StudentSubjectTest {

	public static void main(String[] args) {

		Student studentA = new Student(1001, "A");
		studentA.addSubject("국어", 100);
		studentA.addSubject("수학", 50);
		
		Student studentB = new Student(1002, "B");
		studentB.addSubject("국어", 70);
		studentB.addSubject("수학", 85);
		studentB.addSubject("영어", 100);
		
		studentA.showScoreInfo();
		System.out.println("==============================");
		studentB.showScoreInfo();
		
	}

}
