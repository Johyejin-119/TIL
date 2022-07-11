package ch09;

public abstract class Computer {
	
	// 구현하지 못할 애들은 추상 메소드로 하고, 하위 클래스에 책임을 위임(=상속받는 니들이 알아서해)
	public abstract void display();
	public abstract void typing();
	
	
	// 공통으로 쓸 메소드는 구현한다
	// turnon/off는 어떻게 구현해야할 지 알 수 있음
	public void turnOn() {
		System.out.println("Computer 전원을 켭니다");
		
	}
	
	public void turnOff() {
		System.out.println("Computer 전원을 끕니다");
	}
}
