package ch06;

import ch04.MyLinkedList;
import ch04.MyListNode;

interface Queue {
	public void enQueue(String data); // 삽입
	public String deQueue(); // 삭제
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

	
	// 큐 삽입
	@Override
	public void enQueue(String data) {

		// 맨 앞으로 들어 가는 경우
		MyListNode newNode;
		if(isEmpty()) {
			newNode = addElement(data); // addElement()의 반환값을 newNode에 담음
			front = newNode;
			rear = newNode;
		}
		// 맨 뒤로 들어 가는 경우
		else {
			newNode = addElement(data);
			rear = newNode;
		}
		System.out.println(newNode.getData() + " added");
	}

	// 큐 제거
	@Override
	public String deQueue() {
		
		// 큐가 빈 경우  =>  제거 error
		if(isEmpty()) {
			return null;
		}
		
		// 맨 앞을 제거하는 경우  => 큐는 맨 앞만 제거한다(FIFO)
		String data = front.getData();
		front = front.next;
		
		// 맨 뒤를 제거하는 경우  => 데이터가 front 하나인 경우
		if(front == null) { // front.next가 null이면
			rear = null; // 마지막 노드라는 의미
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
