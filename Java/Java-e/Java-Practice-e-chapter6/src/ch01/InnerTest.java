package ch01;

class OutClass {
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	// OutClass�� ������ ��, InClass ����
	public OutClass(){
		inClass = new InClass();
	}
	
	// InnerClass
	private class InClass {
		int iNum = 100;
		// InnerClass ���ο����� ���� ���� ��� �Ұ�  => OutClass�� ���� �����ǰ� InClass�����Ǳ� ����
		// static int sInNum = 500;
		
		void inTest() {
			System.out.println("OutCalss num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutCalss sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("OutCalss iNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	
	// InClass�� inTest() �޼��带 ȣ���ϴ�, OutClass�� usingClass() �޼���
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingClass();
		
		// InClass�� private �ƴ� ���  =>  ���������� ����, ���� ������� ����
		// OutClass.InClass inner = outClass.new InClass();
		// inner.inTest();
	}

}
