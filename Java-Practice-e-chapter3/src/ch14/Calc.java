package ch14;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
		myMethod(); // private 메소드 => default 메소드에서 사용 가능
	}
	
	// 정적메서드
	static int total(int[] arr) {
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		myStaticMethod(); // private 메소드 => static 메소드에서 사용 가능
		return total;
	}
	
	
	// private 메소드  => 인터페이스 내부에서만 사용, 구현 메소드에서는 재정의 및 사용 불가
	private void myMethod() {
		System.out.println("myMethod");
		
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
}
