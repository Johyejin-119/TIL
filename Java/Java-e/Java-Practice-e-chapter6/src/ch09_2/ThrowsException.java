package ch09_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// ���� ó�� �̷��
public class ThrowsException {

	// loadClass() �޼��带 ���� ��(main)���� �ڵ鸵�ϵ��� throws
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "abc"); // "java.lang.String" �ϸ� loadClass() �޼��� �� ����Ǿ����Ƿ� end�� ���

		} catch (FileNotFoundException e) { // ���� ������
			System.out.println(e);
		} catch (ClassNotFoundException e) { // ���� ������ Ŭ���� ������
			System.out.println(e);
		}
		System.out.println("end");
	}

}
