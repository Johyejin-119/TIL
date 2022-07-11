package ch01;

class OutClass2 {
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	public OutClass2(){
		inClass = new InClass();
	}
	
	// InnerClass
	private class InClass {
		int iNum = 100;

		void inTest() {
			System.out.println("OutCalss num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutCalss sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("OutCalss iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	// 정적 내부 클래스
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		// 외부 클래스 생성과 무관하게 사용가능  =>  외부 클래스의 인스턴스 변수 사용하면 error(num)
		void inTest() {
			System.out.println("OutCalss num = " + iNum + "(정적 내부 클래스의 인스턴스 변수)");
			System.out.println("OutCalss sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("OutCalss sInNum = " + sInNum + "(정적 내부 클래스의 스태틱 변수)");
		}
		
		// 정적 내부 클래스의 생성과 무관하게 정적 메서드 사용가능  =>  정적 내부 클래스의 인스턴스 변수 사용하면 error(iNum)
		static void sTest() {
			System.out.println("OutCalss sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("OutCalss sInNum = " + sInNum + "(정적 내부 클래스의 스태틱 변수)");
		}
	}
	

}

public class StaticInnerTest {

	public static void main(String[] args) {
		
		// 정적 내부 클래스의 일반 메서드 호출
		OutClass2.InStaticClass sInClass2 = new OutClass2.InStaticClass();
		sInClass2.inTest();
		
		System.out.println();

		// 정적 내부 클래스의 static 메서드 호출		
		OutClass2.InStaticClass.sTest();

	}

}
