package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		
		// 다른 객체이기 때문에 false
		System.out.println(std1 == std2); 
		
		// equals() 오버라이딩 해주면, 논리적으로 같기 때문에 true
		System.out.println(std1.equals(std2));
		
		// hashCode() 오버라이딩 해주면, 논리적으로 같기 때문에 같은 주소 값 출력
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		// 실제 가상 메모리 주소 값 출력
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

		// 같은 주소 값 출력
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("======================");

		// Integer도 String과 마찬가지, 같은 주소 값 출력
		Integer i = 100;
		System.out.println(i.hashCode());
		
*/	

	
	}

}
