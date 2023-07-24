package ch02;

class Outer3 {
	
	int outNum = 100;
	static int sNum = 200;
	
	
	// Runnable java.lang => 클래스를 스레드화할때 사용하는 인터페이스
	Runnable getRunnable(int i) {
		int num = 10;

		// 익명 내부 클래스
		return new Runnable(){
			int localNum = 1000;
			
			// 지역 내부 클래스
			@Override
			public void run() {
				// 마찬가지로 i,num 값은 상수로 변경 불가

				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
				
			}
			
		};
	}
	
	// 익명 내부 클래스2
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable class");
		}
	};
}

public class AnonumousInnerTest {

	public static void main(String[] args) {

		// 익명 내부 클래스 호출  => 클래스 이름이 없어도 똑같이 호출
		Outer3 out = new Outer3();
		Runnable runner = out.getRunnable(100);
		runner.run(); 
		
		out.runnable.run();
		
	}

}
