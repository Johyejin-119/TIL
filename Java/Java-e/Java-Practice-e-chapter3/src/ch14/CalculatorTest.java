package ch14;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		
		CompleteCalc calc2 = new CompleteCalc();
		System.out.println(calc2.add(num1, num2));
		System.out.println(calc2.substract(num1, num2));
		System.out.println(calc2.divide(num1, num2));
		System.out.println(calc2.times(num1, num2));
		
		// CompleteCalc�� description()�� Calc��  description()�� �������̵� �ؼ� ���
		calc2.description();
		
		
		// �����޼ҵ� total ȣ��  => static �޼ҵ� �̱⶧���� �������̽� �̸����� �ٷ� ȣ�� ����
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
	}

}
