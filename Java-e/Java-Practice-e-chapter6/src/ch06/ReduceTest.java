package ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// reduce()연산
class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		{if (s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;}
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {

	// reduce()연산 직접 구현하는 방법
		
		String greetings[] = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다^^"};
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)->
				// length : 배열의 속성이므로 () 없음
				{if (s1.getBytes().length >= s2.getBytes().length) return s1;
				else return s2;}
				// 한글 2byte, 영문 1byte => 영문 2개와 반간습니다^^보다 안녕하세요~~~가 더 길다
				));
	
	
	// BinaryOperator로 reduce()연산 구현한 후, 구현한 클래스 호출하는 방법
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
	}

}
