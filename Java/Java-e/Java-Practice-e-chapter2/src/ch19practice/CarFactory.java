package ch19practice;

public class CarFactory {
	// 싱글톤패턴
	// 하나의 인스턴스만 존재하도록
	private static CarFactory instance = new CarFactory(); 
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
		
	}

	public Car createCar() {
		Car car = new Car();
		return car;
	}

}
