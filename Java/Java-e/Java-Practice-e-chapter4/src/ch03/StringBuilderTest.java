package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java); // 1651191114 ���
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(android); // append()�� buffer�� �� �ֱ�
		System.out.println(System.identityHashCode(buffer)); // 1651191114 ���
		// buffer�� �������̹Ƿ�, �ּҰ��� ����
		
		String test = buffer.toString(); // toString()���� buffer ����ϱ�
		System.out.println(test);
	}

}
