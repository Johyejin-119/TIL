package ch09;

// 예외 처리 AutoCloseable 
public class AutoCloseableObj implements AutoCloseable {

	@Override
	public void close() throws Exception {

		System.out.println("closing...");
	}

}
