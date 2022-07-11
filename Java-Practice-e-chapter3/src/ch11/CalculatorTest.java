package ch11;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		// CompleteCalc는 Calculator와 Calc 두 개를 쓸 수 있음
		// 다만, 앞에 배웠던 것처럼 Calc 타입으로 선언했기때문에 Calc에 있는 메소드만 사용 가능
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.times(num1, num2));
		
		System.out.println("====================");

		// CompleteCalc타입으로 선언하면 사용 가능
		// 다만, 인터페이스로 선언되면 사용 불가 -> 멤버변수 없고, 추상메소드만 있기 때문에 new 객체 생성 불가
		CompleteCalc calc2 = new CompleteCalc();
		System.out.println(calc2.add(num1, num2));
		System.out.println(calc2.substract(num1, num2));
		System.out.println(calc2.divide(num1, num2));
		System.out.println(calc2.times(num1, num2));
		
	}

}
