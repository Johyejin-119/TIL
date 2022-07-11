package ch14_2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream("output.txt")) { // 파일 자동 생성
			fos.write(65); // A 입력
			fos.write(66); // B 입력
			fos.write(67); // C 입력
		
		} catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}
}
