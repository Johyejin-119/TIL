package ch03;

public class AddTest {

	public static void main(String[] args) {

		// 람다식 : (x, y) -> {return x+y;}
		
		Add addL = (x, y) -> {return x+y;};
		Add addL2 = (x, y) ->  x-y; // 실행문 하나이고, return 없는 경우 {중괄호} 생략 가능
		
		System.out.println(addL.add(2, 3));
		System.out.println(addL2.add(2, 3));
	}

}
