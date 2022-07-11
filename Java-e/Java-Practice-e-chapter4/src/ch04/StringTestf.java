package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// 동적 로딩
// reflect 프로그램 => 메소드를 가져와서 메소드를 다시 import
public class StringTestf {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c = Class.forName("java.lang.String"); // 동적 할당
		Constructor[] cons = c.getConstructors(); // getConstructors() 메소드는 Constructor Array로 반환
		for(Constructor co : cons) {
			System.out.println(co); // java.lang.String 의 메소드 출력
		}
		
		Method[] m = c.getMethods();
		for(Method mth : m) {
			System.out.println(mth); // java.lang.String 의 메소드 출력
		}
	}

}
