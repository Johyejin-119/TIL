package ch09;

// 예외 처리 try-catch 및 로그 찍기
public class ArrayIndexException {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()); // Exception의 메시지만
			System.out.println(e.toString()); // Exception의 풀네임 + 메시지
		
		}
		// 로그 찍기  =>  for문만 있으면 비정상 종료로 해당 로그 출력 안됨
		System.out.println("here!!!");
	}

}
