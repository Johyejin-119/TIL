package ch09;

public abstract class Computer {
	
	// �������� ���� �ֵ��� �߻� �޼ҵ�� �ϰ�, ���� Ŭ������ å���� ����(=��ӹ޴� �ϵ��� �˾Ƽ���)
	public abstract void display();
	public abstract void typing();
	
	
	// �������� �� �޼ҵ�� �����Ѵ�
	// turnon/off�� ��� �����ؾ��� �� �� �� ����
	public void turnOn() {
		System.out.println("Computer ������ �մϴ�");
		
	}
	
	public void turnOff() {
		System.out.println("Computer ������ ���ϴ�");
	}
}
