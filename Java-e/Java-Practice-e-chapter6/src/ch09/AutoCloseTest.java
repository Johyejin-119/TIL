package ch09;

public class AutoCloseTest {

	public static void main(String[] args) {

		AutoCloseableObj obj = new AutoCloseableObj();
		
		try(obj) {
			// 아무 코드 없어도 try블록 끝나면? 자동으로 AutoCloseable 
			// => AutoCloseableObj.java의 closing이 잘 출력됨
			
			throw new Exception(); // 예외 강제 생성후, catch문으로 이동함
			
		} catch (Exception e) {
			System.out.println("exception");
		
		}
		System.out.println("end");
	}

}
