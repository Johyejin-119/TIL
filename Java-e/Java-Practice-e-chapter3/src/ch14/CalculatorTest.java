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
		
		// CompleteCalc의 description()이 Calc의  description()을 오버라이딩 해서 출력
		calc2.description();
		
		
		// 정적메소드 total 호출  => static 메소드 이기때문에 인터페이스 이름으로 바로 호출 가능
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
	}

}
