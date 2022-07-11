package ch09_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 한꺼번에 예외 처리 미루기
public class ThrowsException2 {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsException2 test = new ThrowsException2();
		try {
			test.loadClass("a.txt", "java.lang.String"); 

		} catch (FileNotFoundException | ClassNotFoundException e) { // 한 번에
			System.out.println(e);
			
		} catch (Exception e) { // 최상위, 업캐스팅 // 마지막에 작성
			
		}
		System.out.println("end");
	}

}
