package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// ���� ó�� try-with-resources
public class FileExceptionHandlingResources {

	public static void main(String[] args) {
		
		// FileInputStream�� AutoCloseable�� ���� ����
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			System.out.println("read");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		// �ڵ����� close() �޼��� ȣ��
		System.out.println("end");

	}

}
