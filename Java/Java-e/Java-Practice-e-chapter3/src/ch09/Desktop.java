package ch09;

// �߻�޼ҵ尡 ���µ�, �߻�Ŭ������ ������ ���? ������θ� ���� ����
public class Desktop extends Computer { // Computer.java�� ���� ��ӹ޾Ƽ�, ���⼭ �����ϸ� ��

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	
	// ����Ŭ�������� ������ ���� �ٽ� ���⼭ ������ �ص���
	@Override
	public void turnOff() {
		System.out.println("Desktop turnOff");
	}
		

}
