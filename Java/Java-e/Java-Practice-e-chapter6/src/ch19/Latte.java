package ch19;

public class Latte extends Decorator{//  Coffee�� ����

	// ���� Ŭ������ ����Ʈ �����ڰ� �����Ƿ�, �Ű������ִ� �����ڸ� super()�� ȣ���ؾ���
	public Latte(Coffee coffee) {
		super(coffee); 
	} 
	
	@Override
	public void brewing() {
		super.brewing();
		System.out.println("Adding Milk");
	}

}
