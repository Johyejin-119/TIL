package ch03;

public class StringTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java)); // 263025902 ���
		java = java.concat(android); // java�� android ����  => ���ο� ���ڿ� ����
		
		System.out.println(System.identityHashCode(java)); // 438135304 ���
		// android�� ����� java�� ���� java�� �ٸ� �ּڰ��� ����Ų��.
	}

}
