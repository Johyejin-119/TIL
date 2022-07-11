package ch05;

public class MyArrayStackTest {

	public static void main(String[] args) {

		MyArrayStack stack = new MyArrayStack(3);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
//		stack.push(40);
		
		stack.printAll(); // 40은 stack 꽉차서 stack is full 출력
		
		System.out.println("======");
		stack.peek();
		stack.printAll();
	}
}

