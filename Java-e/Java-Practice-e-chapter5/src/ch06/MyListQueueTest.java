package ch06;

public class MyListQueueTest {

	public static void main(String[] args) {

		MyLinkedQueue listQueue = new MyLinkedQueue();
		listQueue.enQueue("A");
		listQueue.enQueue("B");
		listQueue.enQueue("C");
		listQueue.printAll();
		
		// deQueue의 반환값은 String이므로 syso로 출력
		System.out.println(listQueue.deQueue());
		System.out.println(listQueue.deQueue());

	}

}
