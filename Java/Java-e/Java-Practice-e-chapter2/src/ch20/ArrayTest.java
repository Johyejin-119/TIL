package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		// 첫번째 for문 안쓰면, 이렇게 바로 해줘도 됨 
		// int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int[] arr = new int[10]; // new키워드를 쓰게되면, 정수는 o 실수는 0.0 객체는 null로 초기화됨
		int total = 0;
		
		for(int i = 0, num = 1; i <arr.length; i++) {
			arr[i] = num++; // 1,2,3...넣고 값 추가
		}
		
		// 처음부터 끝까지 쭉 순회할 때 이넨스드 for
		for(int num : arr) {
			total += num;
		}
		
		System.out.println(total);
	}

}
