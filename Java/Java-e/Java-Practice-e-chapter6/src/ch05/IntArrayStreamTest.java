package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		for (int num : arr) {
			System.out.println("for�� �̿�: " + num);
		}
		
		System.out.println();

		
		// ��Ʈ�� ���� => ���� ���� ��� ����
		// forEach() : elements�� �ϳ��� ��������  
		Arrays.stream(arr).forEach(n->System.err.println("stream �̿�: " + n));
		
		System.out.println();

		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println("IntStream �̿�: " + n));

		System.out.println();
		
		IntStream is2 = Arrays.stream(arr);
		is2.forEach(n->System.out.println("IntStream �̿�2: " + n));
		// ��Ʈ���� �� �� �����ϸ� �Ҹ�ȴ� => ��Ʈ���� �� ���� �ٽ� ����
		
		
		System.out.println();

		
		int sum = Arrays.stream(arr).sum();
		System.out.println("sum �̿�: " + sum);
	}

}
