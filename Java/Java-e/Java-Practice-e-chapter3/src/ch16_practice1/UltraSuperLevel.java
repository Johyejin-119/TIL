package ch16_practice1;

public class UltraSuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("����κ�Ʈó�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("�ϴ� ���̱��� jump �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("���� turn�� �����մϴ�.");
	}
	
	public void reset() {
		System.out.println("������ ó������ �ٽ� ������ �� �ִ� ī�尡 �ֽ��ϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("=====�ʰ�� ���� UltraSuperLevel=====");
	}

}
