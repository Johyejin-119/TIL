package ch12;

public class Person {


	String name;
	int age;
		
	public Person() {
		/*		
 		// �Ʒ� this�� �����ڰ� �� ��������߸�, �ش� �ڵ� ��밡�� -> this �ؿ� ����� �����ȳ�
  		name = "aaa";
		age = 1;
		
		*/
		this("no name", 1); // �ٸ� �����ڸ� ȣ���ϴ� this
	}
	
	public Person(String name, int age) {
		this.name = name; // �ڱ��ڽ��� �ּҸ� ��Ÿ���� this
		this.age = age; // �ڱ��ڽ��� �ּҸ� ��Ÿ���� this
	}
	
	public void showPerson() {
		System.out.println(name + "," + age);
	}
	
	public Person getPerson() { // �ν��Ͻ��� �ּ� ���
		return this;
	}
	
	public static void main(String[] args) {
		Person person = new Person(); // 1. ���⼭ �ٷ� �����ڸ���
		person.showPerson();
		System.out.println(person);
		
		Person person2 = person.getPerson(); // 2. getPerson()�� this ��ȯ��
		System.out.println(person2);
		
		// => 1,2�� ��� ��� ����. �ּ� ����

	}

}
