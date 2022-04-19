package ch03;

public class StringTest {

	public static void main(String[] args) {

		String java = new String("java");
		String android = new String("android");
		
		System.out.println(System.identityHashCode(java)); // 263025902 출력
		java = java.concat(android); // java와 android 연결  => 새로운 문자열 생성
		
		System.out.println(System.identityHashCode(java)); // 438135304 출력
		// android와 연결된 java는 기존 java와 다른 주솟값을 가리킨다.
	}

}
