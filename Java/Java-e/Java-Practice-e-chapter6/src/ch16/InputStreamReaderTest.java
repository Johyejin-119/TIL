package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		// InputStreamReader ���� ��Ʈ��
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i;
			
			while( (i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			// ���� ��Ʈ���� ������ ��� ��Ʈ���� ���� ���� => �߰��� close ���ص���
		}catch(IOException e) {
			
		}
		
	}

}