package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 예외 처리 try-catch-finally
public class FileExceptionHandling {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
			
		} catch (Exception e) {
			System.out.println(e);
			// return; // 예외발생해도 finally는 동작함
		
		} finally { // 항상 동작
			if(fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}	
			}
			System.out.println("finally");
		}
		System.out.println("end");
		
		
		
		
/* // finally 없이 하면 발생하는 상황  => 코드가 더러움
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
			
			try {
				fis.close();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println(e); // toString()으로 찍힘
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} 
		System.out.println("end"); // 마지막 catch문의 FileNotFoundException e에서 찍힌 것
*/		
	}

}
