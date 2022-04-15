package ch10;

// 추상클래스 이용한 템플릿 메서드 패턴
public abstract class Car {

	// 여기 필요한 메소드는 각각 클래스에서 정의
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	// 구현된 메소드
	public void starCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 구현된 메서드인데, 구현 내용이 없는 것 => 자식 클래스에서 재정의(오버라이딩) 할때 사용
	public void washCar() {}
	
	// 우리가 변경할 수 없는 시나리오
	// 주행을 하기 위해 필요한 메소드를 넣는다 -> 구현 메소드, 추상 메소드 상관없음
	final public void run() { // 안에 추상 메서드 순서대로 동작해야함 -> 변하면(재정의하면) 안되기 때문에 final
		starCar(); // 구현된 메소드
		drive(); // 추상 메소드
		wiper(); // 추상 메소드
		stop(); // 추상 메소드
		turnOff(); // 구현된 메소드
		washCar(); // 구현된 빈 메소드를 오버라이딩
	}
}  
