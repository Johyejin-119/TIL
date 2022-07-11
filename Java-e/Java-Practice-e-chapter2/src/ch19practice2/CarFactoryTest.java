package ch19practice2;

public class CarFactoryTest {

	public static void main(String[] args) {

		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar();
		Car sonata2 = factory.createCar();
		
		System.out.println(sonata1.getCarNumber());
		System.out.println(sonata2.getCarNumber());
	}

}
