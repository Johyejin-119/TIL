package ch15_2;

public interface Queue {

	// �ֱ� 
	void enQueue(String title);
	
	// ������
	String deQueue();

	// ť�ȿ� � �ִ°�?
	int getSize();
}
