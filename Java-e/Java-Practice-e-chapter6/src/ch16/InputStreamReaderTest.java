package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {

		// InputStreamReader 보조 스트림
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i;
			
			while( (i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			// 보조 스트림이 닫히면 기반 스트림도 같이 닫힘 => 추가로 close 안해도됨
		}catch(IOException e) {
			
		}
		
	}

}
