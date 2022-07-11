package ch19;

public abstract class Decorator extends Coffee{ // 상속을 하기위한 상위클래스만 쓰는 Decorator.java

	Coffee coffee;
	public Decorator(Coffee coffee) { // Coffee를 상속받는 인자 값들은 모두 들어올 수 있다
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {

		coffee.brewing();
	}

}
