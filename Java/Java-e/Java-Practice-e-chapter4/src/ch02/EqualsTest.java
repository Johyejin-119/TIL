package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		
		// �ٸ� ��ü�̱� ������ false
		System.out.println(std1 == std2); 
		
		// equals() �������̵� ���ָ�, �������� ���� ������ true
		System.out.println(std1.equals(std2));
		
		// hashCode() �������̵� ���ָ�, �������� ���� ������ ���� �ּ� �� ���
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		// ���� ���� �޸� �ּ� �� ���
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		System.out.println("======================");

		// clone()
		std1.setStudentName("KIM");
		Student copyStudent = (Student) std1.clone(); // 100,KIM
		System.out.println(copyStudent);
		
/*	
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));

		// ���� �ּ� �� ���
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("======================");

		// Integer�� String�� ��������, ���� �ּ� �� ���
		Integer i = 100;
		System.out.println(i.hashCode());
		
*/	

	
	}

}
