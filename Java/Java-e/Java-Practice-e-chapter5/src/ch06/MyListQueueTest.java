package ch06;

public class MyListQueueTest {

	public static void main(String[] args) {

		MyLinkedQueue listQueue = new MyLinkedQueue();
		listQueue.enQueue("A");
		listQueue.enQueue("B");
		listQueue.enQueue("C");
		listQueue.printAll();
		
		// deQueue�� ��ȯ���� String�̹Ƿ� syso�� ���
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());

	}

}
