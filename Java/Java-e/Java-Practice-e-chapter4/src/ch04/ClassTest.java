package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class cl = Class.forName("ch04.Person");
		
		Person person = (Person)cl.newInstance(); // ��ȯ���� ���� Object Ŭ���� Ÿ���̱� ������, Person Ŭ���� Ÿ������ ĳ����
		
		person.setName("Lee");
		System.out.println(person);

		// 1
		Class c2 = person.getClass(); // person�� �̹� �����Ǿ�������, Object�� getClass()��밡��
		Person p = (Person)c2.newInstance();
		System.out.println(p);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"Kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
		
		// 2
		Person kim2 = new Person("Kim", 0);
		
		// 1,2�� ������ ���
	}

}
