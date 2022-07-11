package ch01;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	// OutClass가 생성된 후, InClass 생성
	public OutClass(){
		inClass = new InClass();
	}
	
	// InnerClass
	private class InClass {
		int iNum = 100;
		// InnerClass 내부에서는 정적 변수 사용 불가  => OutClass가 먼저 생성되고 InClass생성되기 때문
		// static int sInNum = 500;
		
		void inTest() {
			System.out.println("OutCalss num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutCalss sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("OutCalss iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	
	// InClass의 inTest() 메서드를 호출하는, OutClass의 usingClass() 메서드
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		// InClass가 private 아닌 경우  =>  문법적으로 가능, 거의 사용하지 않음
		// OutClass.InClass inner = outClass.new InClass();
		// inner.inTest();
	}

}
