package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read()); 
			System.out.println((char)fis.read()); 
			
		} catch (IOException e) { // FileNotFoundException보다 IOException이 부모 클래스
			e.printStackTrace();
		
		} finally {
			try {
				fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
				
			} catch(Exception e1) { // NullPointerException이 발생하므로 Exception 걸어줌
				System.out.println(e1);
			}
		}
		System.out.println("end");
	}

}