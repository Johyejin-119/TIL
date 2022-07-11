package ch02;

public class StudentTestPratice {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.studentNumber = 17422001;
		student1.setStudentName("JOHEYJIN");
		student1.majorName = "JAVA";
		student1.majorCode = 99;
		student1.setGrade(1);
		
		student1.showStudentInfo();
		student1.showMajorInfo();	
		
	}

}
