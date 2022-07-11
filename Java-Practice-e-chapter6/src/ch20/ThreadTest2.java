package ch20;

// Runnable 인터페이스 구현하여 만들기
class MyThread2 implements Runnable {

	@Override
	public void run() {
		int i;
		for(i = 1; i<=200; i++) {
			System.out.print(i + "\t");
			
		}		
	}

}

public class ThreadTest2 {

	public static void main(String[] args) {

		// main에서 돌아가는 thread 확인
		System.out.println(Thread.currentThread() + "start");
		
		MyThread2 runnable = new MyThread2();

		// thread 생성
		Thread th1 = new Thread(runnable); // runnable기반으로 thread 동작
		Thread th2 = new Thread(runnable);
		
		// thread 시작
		th1.start();
		th2.start();
		
		System.out.println(Thread.currentThread() + "end");
	
		Runnable run = new Runnable() {
			@Override
			public void run() {

				System.out.println("run");
			}
		};
		
		run.run();

	}

}
