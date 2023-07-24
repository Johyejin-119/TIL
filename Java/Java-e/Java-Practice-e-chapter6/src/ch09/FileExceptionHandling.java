package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// ���� ó�� try-catch-finally
public class FileExceptionHandling {

	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
			
		} catch (Exception e) {
			System.out.println(e);
			// return; // ���ܹ߻��ص� finally�� ������
		
		} finally { // �׻� ����
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
		
		
		
		
/* // finally ���� �ϸ� �߻��ϴ� ��Ȳ  => �ڵ尡 ������
		
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
			System.out.println(e); // toString()���� ����
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} 
		System.out.println("end"); // ������ catch���� FileNotFoundException e���� ���� ��
*/		
	}

}
