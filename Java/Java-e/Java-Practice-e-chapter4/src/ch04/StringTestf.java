package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// ���� �ε�
// reflect ���α׷� => �޼ҵ带 �����ͼ� �޼ҵ带 �ٽ� import
public class StringTestf {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c = Class.forName("java.lang.String"); // ���� �Ҵ�
		Constructor[] cons = c.getConstructors(); // getConstructors() �޼ҵ�� Constructor Array�� ��ȯ
		for(Constructor co : cons) {
			System.out.println(co); // java.lang.String �� �޼ҵ� ���
		}
		
		Method[] m = c.getMethods();
		for(Method mth : m) {
			System.out.println(mth); // java.lang.String �� �޼ҵ� ���
		}
	}

}
