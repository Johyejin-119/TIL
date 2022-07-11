package ch05;

import ch03.MyArray;

public class MyArrayStack {

	int top;
	MyArray arrayStack; 
	
	public MyArrayStack()
	{	// 디폴트 초기화하면, 10개짜리 Array가 만들어지므로 아래처럼 해주기
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size)
	{
		arrayStack = new MyArray(size);
	}
	
	// 데이터 삽입
	public void push(int data)
	{
		// 스택이 꽉 찬 경우 => error
		if(isFull()){
			System.out.println("stack is full");
			return /* MyArray.ERROR_NUM */;
		}
		// 배열의 뒤쪽으로 데이터 추가
		arrayStack.addElement(data);
		top++;
	}
	
	// 데이터 빼오기
	public int pop()
	{
		// 스택이 빈 경우
		if (top == 0){
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		// 삭제하면 top(element의 개수)이 하나 줄어들기 때문에  =>  --top
		return arrayStack.removeElement(--top);
		
	}
	
	// 데이터 확인
	public int peek()
	{
		if (top == 0){
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		return arrayStack.getElement(top-1);
	}
	
	public int getSize()
	{
		return top;
	}
	
	// 스택이 꽉 찼는 지 확인
	public boolean isFull()
	{
		// top : element의 개수  => 스택이 꽉 찼는 지 확인 가능
		if(top == arrayStack.ARRAY_SIZE){ // 꽉 찬 경우
			return true;
		}
		else return false;
	}
	
	// 스택이 비었는 지 확인
	public boolean isEmpty()
	{
		// top : element의 개수 
		if (top == 0){ // 빈 경우
			return true;
		}
		else return false;
	}
	
	public void printAll()
	{
		arrayStack.printAll();
	}
}
