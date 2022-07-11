package ch09_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 예외 처리 미루기
public class ThrowsException {

	// loadClass() 메서드를 쓰는 쪽(main)에서 핸들링하도록 throws
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "abc"); // "java.lang.String" 하면 loadClass() 메서드 잘 수행되었으므로 end만 출력

		} catch (FileNotFoundException e) { // 파일 없으면
			System.out.println(e);
		} catch (ClassNotFoundException e) { // 파일 있지만 클래스 없으면
			System.out.println(e);
		}
		System.out.println("end");
	}

}
