package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 예외 처리 try-with-resources
public class FileExceptionHandlingResources {

	public static void main(String[] args) {
		
		// FileInputStream은 AutoCloseable를 갖고 있음
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			System.out.println("read");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 자동으로 close() 메서드 호출
		System.out.println("end");

	}

}
