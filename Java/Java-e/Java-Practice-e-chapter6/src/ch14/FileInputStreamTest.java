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
			
		} catch (IOException e) { // FileNotFoundException���� IOException�� �θ� Ŭ����
			e.printStackTrace();
		
		} finally {
			try {
				fis.close();
				
			} catch (IOException e) {
				e.printStackTrace();
				
			} catch(Exception e1) { // NullPointerException�� �߻��ϹǷ� Exception �ɾ���
				System.out.println(e1);
			}
		}
		System.out.println("end");
	}

}