package ch05;
// 6�� ������
public class Student {

		// �� ��������� null, o���� �ڵ����� �ʱ�ȭ
		public int studentNumber;
		public String studentName;
		public int grade;
	
		//����Ʈ ������ -> �����ڰ� �ϳ��� ���� �� ���������. StudentTest.java 7�� �ڵ�
		public Student() {} 
		
		public Student(int studentNumber, String studentName, int grade) { // �л� ������ �Ű������� �޾Ƽ� �ʱ�ȭ�� ��
			this.studentNumber = studentNumber; // �� ��������� �Ű������� �Ѱ���
			this.studentName = studentName;
			this.grade = grade;
		}
		
		public String showStudentInfo() {
			return studentName + "�л��� �й��� " + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
		}

}
