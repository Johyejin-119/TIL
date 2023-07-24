package ch20;

// Runnable �������̽� �����Ͽ� �����
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

		// main���� ���ư��� thread Ȯ��
		System.out.println(Thread.currentThread() + "start");
		
		MyThread2 runnable = new MyThread2();

		// thread ����
		Thread th1 = new Thread(runnable); // runnable������� thread ����
		Thread th2 = new Thread(runnable);
		
		// thread ����
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
