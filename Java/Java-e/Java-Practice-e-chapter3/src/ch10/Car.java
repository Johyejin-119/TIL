package ch10;

// �߻�Ŭ���� �̿��� ���ø� �޼��� ����
public abstract class Car {

	// ���� �ʿ��� �޼ҵ�� ���� Ŭ�������� ����
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	// ������ �޼ҵ�
	public void starCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	// ������ �޼����ε�, ���� ������ ���� �� => �ڽ� Ŭ�������� ������(�������̵�) �Ҷ� ���
	public void washCar() {}
	
	// �츮�� ������ �� ���� �ó�����
	// ������ �ϱ� ���� �ʿ��� �޼ҵ带 �ִ´� -> ���� �޼ҵ�, �߻� �޼ҵ� �������
	final public void run() { // �ȿ� �߻� �޼��� ������� �����ؾ��� -> ���ϸ�(�������ϸ�) �ȵǱ� ������ final
		starCar(); // ������ �޼ҵ�
		drive(); // �߻� �޼ҵ�
		wiper(); // �߻� �޼ҵ�
		stop(); // �߻� �޼ҵ�
		turnOff(); // ������ �޼ҵ�
		washCar(); // ������ �� �޼ҵ带 �������̵�
	}
}  
