package ch14_2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("output.txt")) { // ���� �ڵ� ����
			fos.write(65); // A �Է�
			fos.write(66); // B �Է�
			fos.write(67); // C �Է�
		
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}
}
