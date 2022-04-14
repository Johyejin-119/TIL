package ch18;
// 싱글톤패턴

public class Company { 
	// 하나의 인스턴스만 존재하도록, 유일한 객체
	private static Company instance = new Company();
	
	// 디폴트 생성자를 컴파일러가 기본 값으로 제공해주기 때문에, public class Company {}; 이렇게 두면 외부에서 그대로 사용가능 => private로 만들기
	private Company() {}
	
	// 인스턴스를 생성하고난 후, 아래 메소드를 호출할 수 있음 => static으로 선언 => 외부에서 클래스이름으로 해당 메소드 호출 가능
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
