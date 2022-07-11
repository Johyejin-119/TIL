package ch19practice2;

public class Car {
	
	private static int serialNum = 1000;
	private int carNumber;
	
	// public으로 해야함
	public Car() {
		serialNum++;
		carNumber = serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

}
