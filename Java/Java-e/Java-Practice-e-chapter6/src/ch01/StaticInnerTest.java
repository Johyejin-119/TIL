package ch01;

class OutClass2 {
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;
	public OutClass2(){
		inClass = new InClass();
	}
	
	// InnerClass
	private class InClass {
		int iNum = 100;

		void inTest() {
			System.out.println("OutCalss num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutCalss sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("OutCalss iNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	// ���� ���� Ŭ����
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;
		
		// �ܺ� Ŭ���� ������ �����ϰ� ��밡��  =>  �ܺ� Ŭ������ �ν��Ͻ� ���� ����ϸ� error(num)
		void inTest() {
			System.out.println("OutCalss num = " + iNum + "(���� ���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutCalss sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("OutCalss sInNum = " + sInNum + "(���� ���� Ŭ������ ����ƽ ����)");
		}
		
		// ���� ���� Ŭ������ ������ �����ϰ� ���� �޼��� ��밡��  =>  ���� ���� Ŭ������ �ν��Ͻ� ���� ����ϸ� error(iNum)
		static void sTest() {
			System.out.println("OutCalss sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("OutCalss sInNum = " + sInNum + "(���� ���� Ŭ������ ����ƽ ����)");
		}
	}
	

}

public class StaticInnerTest {

	public static void main(String[] args) {
		
		// ���� ���� Ŭ������ �Ϲ� �޼��� ȣ��
		OutClass2.InStaticClass sInClass2 = new OutClass2.InStaticClass();
		sInClass2.inTest();
		
		System.out.println();

		// ���� ���� Ŭ������ static �޼��� ȣ��		
		OutClass2.InStaticClass.sTest();

	}

}
