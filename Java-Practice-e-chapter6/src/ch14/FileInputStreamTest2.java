package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			
			byte[] bs = new byte[10];
			
			// byte 수를 반환
			while( (i = fis.read(bs, 1, 9)) != -1 ) { // Offset값 1, 9개만 읽음
				for(int j = 0; j < i; j++) {
					System.out.print((char)bs[j]); // 읽은 자료만 반환
				}
				System.out.println(" : " + i + "바이트 읽음"); // byte 개수
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
