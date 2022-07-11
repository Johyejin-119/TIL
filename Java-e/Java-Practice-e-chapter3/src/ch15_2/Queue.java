package ch15_2;

public interface Queue {

	// 넣기 
	void enQueue(String title);
	
	// 꺼내기
	String deQueue();

	// 큐안에 몇개 있는가?
	int getSize();
}
