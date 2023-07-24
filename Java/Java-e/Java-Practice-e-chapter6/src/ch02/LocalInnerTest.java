package ch02;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	// Outer2�� �����ǰ� run()�����ǹǷ�, outNum�� SNum�� run()���� ��� ���� 
	
	
	// Runnable java.lang => Ŭ������ ������ȭ�Ҷ� ����ϴ� �������̽�
	Runnable getRunnable(final int i) {
		final int num = 10;
		// i, num�� ���ø޸𸮿� �����ǹǷ�, run()���� ��밡��

		class MyRunnable implements Runnable{
			int localNum = 1000;
			
			// ���� ���� Ŭ����
			@Override
			public void run() {
				/* �ܺ� ���� ������ ����� �� ������ �� 
				 run()�� Outer2 ȣ���� �������� �� ȣ��� �� �ִ�.
				 
				 Outer2�� ȣ���� ���� ���Ŀ���, run()�� Runnable�� implements �߱� ������ �� ȣ��� �� ����
				 Outer2�� ���� �޸𸮿� �����ϰ�, ȣ�� ����� �޸� �����
				 	=> 	run()�� ���ø� �޸𸮿� ����Ǹ� �ȵǰ�, final�� ��� ó��
				 
				 run()���� Outer2�� ���� ȣ���ϸ�? error
				 final ����� �� ������ �Ұ���
					=>	num = 200;   // error ���������� ����� �ٲ�
						i = 100;     // error �Ű� ���� ���� ��������ó�� ����� �ٲ�		 
				*/
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);
					
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(�ܺ� Ŭ���� ���� ����)");
				
			}
			
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100); // Runnable �޼��� ȣ�� ��!
		runner.run(); // But, run() �޼��� ȣ�� ����
		
		
	}

}
