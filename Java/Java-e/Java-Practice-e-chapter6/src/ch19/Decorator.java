package ch19;

public abstract class Decorator extends Coffee{ // ����� �ϱ����� ����Ŭ������ ���� Decorator.java

	Coffee coffee;
	public Decorator(Coffee coffee) { // Coffee�� ��ӹ޴� ���� ������ ��� ���� �� �ִ�
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {

		coffee.brewing();
	}

}
