package ch02;

class Outer3 {
	
	int outNum = 100;
	static int sNum = 200;
	
	
	// Runnable java.lang => Ŭ������ ������ȭ�Ҷ� ����ϴ� �������̽�
	Runnable getRunnable(int i) {
		int num = 10;

		// �͸� ���� Ŭ����
		return new Runnable(){
			int localNum = 1000;
			
			// ���� ���� Ŭ����
			@Override
			public void run() {
				// ���������� i,num ���� ����� ���� �Ұ�

				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(�ܺ� Ŭ���� ���� ����)");
				
			}
			
		};
	}
	
	// �͸� ���� Ŭ����2
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Runnable class");
		}
	};
}

public class AnonumousInnerTest {

	public static void main(String[] args) {

		// �͸� ���� Ŭ���� ȣ��  => Ŭ���� �̸��� ��� �Ȱ��� ȣ��
		Outer3 out = new Outer3();
		Runnable runner = out.getRunnable(100);
		runner.run(); 
		
		out.runnable.run();
		
	}

}
