package ch11;

public class CompleteCalc extends Calculator { // Calculator�� ��ӹް�, Calc�� Ÿ�Ի�� ����
	// ���� ��� -> ���� �ڵ带 ��� ���� ��
	// Ÿ�� ��� -> ������Ӱ� �ٸ�. ��� ���� Ŭ����(CompleteCalc)�� �ش� �������̽�(Calc)�� Ÿ���̴ٶ�� ��
	
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 == 0)
			return ERROR;
		return num1/num2;
	}
	
	public void showInfo() {
		System.out.println("��� �����߽��ϴ�.");
	}

}
