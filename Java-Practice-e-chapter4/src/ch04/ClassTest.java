package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class cl = Class.forName("ch04.Person");
		
		Person person = (Person)cl.newInstance(); // 반환값이 원래 Object 클래스 타입이기 때문에, Person 클래스 타입으로 캐스팅
		
		person.setName("Lee");
		System.out.println(person);

		// 1
		Class c2 = person.getClass(); // person이 이미 생성되어있으면, Object의 getClass()사용가능
		Person p = (Person)c2.newInstance();
		System.out.println(p);
		
		Class[] parameterTypes = {String.class};
		Constructor cons = c2.getConstructor(parameterTypes);
		
		Object[] initargs = {"Kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
		
		// 2
		Person kim2 = new Person("Kim", 0);
		
		// 1,2는 동일한 결과
	}

}
