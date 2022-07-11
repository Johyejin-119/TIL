package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {

		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		int i;
		try {
			
			InputStreamReader irs = new InputStreamReader(System.in); // 보조스트림으로 byte를 문자로
			while((i = irs.read()) != '\n') { 
				System.out.print((char)i);	
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
