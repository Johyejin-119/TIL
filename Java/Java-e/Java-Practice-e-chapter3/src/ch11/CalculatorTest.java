package ch11;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		// CompleteCalc�� Calculator�� Calc �� ���� �� �� ����
		// �ٸ�, �տ� ����� ��ó�� Calc Ÿ������ �����߱⶧���� Calc�� �ִ� �޼ҵ常 ��� ����
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.times(num1, num2));
		
		System.out.println("====================");

		// CompleteCalcŸ������ �����ϸ� ��� ����
		// �ٸ�, �������̽��� ����Ǹ� ��� �Ұ� -> ������� ����, �߻�޼ҵ常 �ֱ� ������ new ��ü ���� �Ұ�
		CompleteCalc calc2 = new CompleteCalc();
		System.out.println(calc2.add(num1, num2));
		System.out.println(calc2.substract(num1, num2));
		System.out.println(calc2.divide(num1, num2));
		System.out.println(calc2.times(num1, num2));
		
	}

}
