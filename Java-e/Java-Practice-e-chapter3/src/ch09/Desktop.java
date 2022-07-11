package ch09;

// 추상메소드가 없는데, 추상클래스로 선언한 경우? 상속으로만 쓰기 위해
public class Desktop extends Computer { // Computer.java로 부터 상속받아서, 여기서 구현하면 됨

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	
	// 상위클래스에서 구현된 것을 다시 여기서 재정의 해도됨
	@Override
	public void turnOff() {
		System.out.println("Desktop turnOff");
	}
		

}
