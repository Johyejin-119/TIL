package ch11;

public class CompleteCalc extends Calculator { // Calculator를 상속받고, Calc를 타입상속 받음
	// 구현 상속 -> 구현 코드를 상속 받은 것
	// 타입 상속 -> 구현상속과 다름. 상속 받은 클래스(CompleteCalc)는 해당 인터페이스(Calc)의 타입이다라는 뜻
	
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
		System.out.println("모두 구현했습니다.");
	}

}
