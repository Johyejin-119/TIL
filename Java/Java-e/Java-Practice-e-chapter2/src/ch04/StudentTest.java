package ch04;

public class StudentTest {

	public static void main(String[] args) {

		// Ŭ���� Student�� ������ Ÿ��! Ŭ������ ���� ������ ũ�Ⱑ ������������ ����
		// new Student()�� ������
		// �ϳ��� �������� �ν��Ͻ�(studentLee, studentKim) ���� ����
		// �ν��Ͻ����� ���� �ٸ� studentID, address�� ��������� ����
		
		Student studentLee = new Student(); 
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();
		
		
		Student studentKim = new Student();

		studentKim.studentID = 54321;
		studentKim.setStudentName("Kim");
		studentKim.address = "��⵵ ������";
		
		studentKim.showStudentInfo();

	}

}
