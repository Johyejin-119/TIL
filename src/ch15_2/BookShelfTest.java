package ch15_2;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new Bookshelf();
		bookQueue.enQueue("토지1");
		bookQueue.enQueue("토지2");
		bookQueue.enQueue("토지3");
		bookQueue.enQueue("토지4");
		bookQueue.enQueue("토지5");
	
		// 몇권 들어갔는 지
		System.out.println(bookQueue.getSize());
		
		// 한권씩 꺼내오기 -> 큐에서 하나씩 제거됨
		System.out.println(bookQueue.deQueue()); 
		System.out.println(bookQueue.deQueue()); 
		System.out.println(bookQueue.deQueue()); 
		System.out.println(bookQueue.deQueue()); 
		System.out.println(bookQueue.deQueue()); 
	}

}
