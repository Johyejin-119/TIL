package ch05;
// 6�� ������
public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(); // �����ڸ� ���� ������� ��쿣 ������ �ߴµ� => �ش� Ŭ����(Student.java)�� ����Ʈ �����ڸ� ������ָ� �ȴ�.
		studentLee.grade=1;
		System.out.println(studentLee.showStudentInfo());
	
		Student studentKim = new Student(123456, "KIM", 3);
		System.out.println(studentKim.showStudentInfo());
		
	}

}
