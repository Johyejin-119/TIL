package ch08pratice;

public class PersonTest {

	public static void main(String[] args) {

		Person Tomas = new Person();
		Tomas.height = 180;
		Tomas.weight = 78;
		Tomas.gender = "����";
		Tomas.name = "Tomas";
		Tomas.age = 37;
		
		System.out.println(Tomas.showPersonInfo());
		Tomas.showPersonInfo2();
		
		
		Person Tomas2 = new Person(190,88,"����","Tomas2",47);
		System.out.println(Tomas2.showPersonInfo());
	}

}
