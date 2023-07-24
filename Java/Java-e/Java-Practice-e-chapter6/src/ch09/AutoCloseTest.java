package ch09;

public class AutoCloseTest {

	public static void main(String[] args) {

		AutoCloseableObj obj = new AutoCloseableObj();
		
		try(obj) {
			// �ƹ� �ڵ� ��� try��� ������? �ڵ����� AutoCloseable 
			// => AutoCloseableObj.java�� closing�� �� ��µ�
			
			throw new Exception(); // ���� ���� ������, catch������ �̵���
			
		} catch (Exception e) {
			System.out.println("exception");
		
		}
		System.out.println("end");
	}

}
