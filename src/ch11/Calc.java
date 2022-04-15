package ch11;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	// 얘네들을 '상속한다'가 아니라, '구현한다'라고 함 -> 클래스 생성 후 구현해보자
}
