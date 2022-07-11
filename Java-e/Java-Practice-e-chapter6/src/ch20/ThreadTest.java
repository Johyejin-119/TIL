package ch20;

// Thread 클래스 상속하여 만들기
class MyThread extends Thread {
	public void run() {
		int i;
		for(i = 1; i<=200; i++) {
			System.out.print(i + "\t");
			
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {

		// main에서 돌아가는 thread 확인
		System.out.println(Thread.currentThread() + "start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		// thread 시작
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread() + "end");

	}

}
