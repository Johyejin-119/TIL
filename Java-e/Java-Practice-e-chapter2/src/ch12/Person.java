package ch12;

public class Person {


	String name;
	int age;
		
	public Person() {
		/*		
 		// 아래 this로 생성자가 다 만들어져야만, 해당 코드 사용가능 -> this 밑에 적어야 오류안남
  		name = "aaa";
		age = 1;
		
		*/
		this("no name", 1); // 다른 생성자를 호출하는 this
	}
	
	public Person(String name, int age) {
		this.name = name; // 자기자신의 주소를 나타내는 this
		this.age = age; // 자기자신의 주소를 나타내는 this
	}
	
	public void showPerson() {
		System.out.println(name + "," + age);
	}
	
	public Person getPerson() { // 인스턴스의 주소 출력
		return this;
	}
	
	public static void main(String[] args) {
		Person person = new Person(); // 1. 여기서 바로 생성자만듦
		person.showPerson();
		System.out.println(person);
		
		Person person2 = person.getPerson(); // 2. getPerson()의 this 반환값
		System.out.println(person2);
		
		// => 1,2번 출력 결과 동일. 주소 동일

	}

}
