package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			
			byte[] bs = new byte[10];
			
			// byte ���� ��ȯ
			while( (i = fis.read(bs, 1, 9)) != -1 ) { // Offset�� 1, 9���� ����
				for(int j = 0; j < i; j++) {
					System.out.print((char)bs[j]); // ���� �ڷḸ ��ȯ
				}
				System.out.println(" : " + i + "����Ʈ ����"); // byte ����
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
