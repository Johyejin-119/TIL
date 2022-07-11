package ch05_2;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		// 기존 방식
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString("Hello", "World");
		
		// 람다식 방식  => Anonumous 자동 생성되므로 StringConcatImpl.java 생략 가능
		StringConcat concat = (s, v)->System.out.println(s + "," + v);
		concat.makeString(s1, s2);
		
		// Anonumous 클래스에서 makeString()  => 메서드는 한 개만 가능
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				
				System.out.println(s1 + "...." + s2);
			}
		};
		concat2.makeString(s1, s2);
	}

}
