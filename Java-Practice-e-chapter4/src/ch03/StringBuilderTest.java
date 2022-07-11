package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java); // 1651191114 출력
		System.out.println(System.identityHashCode(buffer));
		
		buffer.append(android); // append()로 buffer에 값 넣기
		System.out.println(System.identityHashCode(buffer)); // 1651191114 출력
		// buffer는 가변적이므로, 주소값이 동일
		
		String test = buffer.toString(); // toString()으로 buffer 사용하기
		System.out.println(test);
	}

}
