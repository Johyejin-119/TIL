package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		for (int num : arr) {
			System.out.println("for문 이용: " + num);
		}
		
		System.out.println();

		
		// 스트림 생성 => 아주 많은 기능 제공
		// forEach() : elements를 하나씩 꺼내오기  
		Arrays.stream(arr).forEach(n->System.err.println("stream 이용: " + n));
		
		System.out.println();

		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println("IntStream 이용: " + n));

		System.out.println();
		
		IntStream is2 = Arrays.stream(arr);
		is2.forEach(n->System.out.println("IntStream 이용2: " + n));
		// 스트림은 한 번 연산하면 소모된다 => 스트림은 한 개씩 다시 생성
		
		
		System.out.println();

		
		int sum = Arrays.stream(arr).sum();
		System.out.println("sum 이용: " + sum);
	}

}
