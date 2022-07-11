package ch19;

public class Latte extends Decorator{//  Coffee도 포함

	// 상위 클래스에 디폴트 생성자가 없으므로, 매개변수있는 생성자를 super()로 호출해야함
	public Latte(Coffee coffee) {
		super(coffee); 
	} 
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.println("Adding Milk");
	}

}
