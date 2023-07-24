package ch06;

import ch04.MyLinkedList;
import ch04.MyListNode;

interface Queue {
	public void enQueue(String data); // ����
	public String deQueue(); // ����
	public void printQueue();
}

public class MyLinkedQueue extends MyLinkedList implements Queue{

	MyListNode front;
	MyListNode rear;
	
	public void MyListQueue()
	{
		front = null;
		rear = null;
	}

	
	// ť ����
	@Override
	public void enQueue(String data) {

		// �� ������ ��� ���� ���
		MyListNode newNode;
		if(isEmpty()) {
			newNode = addElement(data); // addElement()�� ��ȯ���� newNode�� ����
			front = newNode;
			rear = newNode;
		}
		// �� �ڷ� ��� ���� ���
		else {
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() + " added");
	}

	// ť ����
	@Override
	public String deQueue() {
		
		// ť�� �� ���  =>  ���� error
		if(isEmpty()) {
			return null;
		}
		
		// �� ���� �����ϴ� ���  => ť�� �� �ո� �����Ѵ�(FIFO)
		String data = front.getData();
		front = front.next;
		
		// �� �ڸ� �����ϴ� ���  => �����Ͱ� front �ϳ��� ���
		if(front == null) { // front.next�� null�̸�
			rear = null; // ������ ����� �ǹ�
		}
		return data;
	}

	@Override
	public void printQueue() {

		if(isEmpty()){
			System.out.println("Queue is Empty");
			return;
		}
		MyListNode temp = front;
		while(temp!= null){
			System.out.print(temp.getData() + ",");
			temp = temp.next;
		}
		System.out.println();
	}

}
