package ch08pratice;

public class Person {

	public int height;
	public int weight;
	public String gender;
	public String name;
	public int age;
	
	public Person(){};
	
	public Person(int height, int weight, String gender, String name, int age) {
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	
	public String showPersonInfo() {
		return "Ű�� " + height + "�̰� �����԰� " + weight + "�� ������ �ֽ��ϴ�. �̸��� " + name + "�̰� ���̴� " + age + "�� �Դϴ�."; 
	}
	
	public void showPersonInfo2() {
	 System.out.println("2. Ű�� " + height + "�̰� �����԰� " + weight + "�� ������ �ֽ��ϴ�. �̸��� " + name + "�̰� ���̴� " + age + "�� �Դϴ�.");
	 
    }
}
