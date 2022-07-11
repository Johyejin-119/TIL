package ch21;

public class JoinTest extends Thread{
	
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		int i;
		for(i = start; i <= end; i++) {
			total += i;
		}
	}
	
	
	public static void main(String[] args) {

		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		// main은 join() 아래 코드를 수행하지 않고, join() 결과가 나올 때까지 기다림
		try {
			jt1.join();
			jt2.join();

		} catch (InterruptedException e) { 
			// thread가 혹시 Not Runnable 상태에 빠져서 돌아오지 못했을 때, main은 실행되도록 예외처리
			e.printStackTrace();
	
		}
		
		int lastTotal = jt1.total + jt2.total; // join() 수행 후, lastTotal 값에는 더한 값이 들어감
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println("lastTotal = " + lastTotal); 

	}

}
