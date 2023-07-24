package ch02;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	// Outer2가 생성되고 run()생성되므로, outNum와 SNum은 run()에서 사용 가능 
	
	
	// Runnable java.lang => 클래스를 스레드화할때 사용하는 인터페이스
	Runnable getRunnable(final int i) {
		final int num = 10;
		// i, num은 스택메모리에 생성되므로, run()에서 사용가능

		class MyRunnable implements Runnable{
			int localNum = 1000;
			
			// 지역 내부 클래스
			@Override
			public void run() {
				/* 외부 지역 변수를 사용할 때 주의할 점 
				 run()은 Outer2 호출이 끝나더라도 또 호출될 수 있다.
				 
				 Outer2의 호출이 끝난 이후에도, run()는 Runnable을 implements 했기 때문에 또 호출될 수 있음
				 Outer2는 스택 메모리에 저장하고, 호출 종료시 메모리 사라짐
				 	=> 	run()은 스택메 메모리에 저장되면 안되고, final로 상수 처리
				 
				 run()에서 Outer2의 변수 호출하면? error
				 final 상수로 값 변경이 불가함
					=>	num = 200;   // error 지역변수는 상수로 바뀜
						i = 100;     // error 매개 변수 역시 지역변수처럼 상수로 바뀜		 
				*/
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
				
			}
			
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100); // Runnable 메서드 호출 끝!
		runner.run(); // But, run() 메서드 호출 가능
		
		
	}

}
