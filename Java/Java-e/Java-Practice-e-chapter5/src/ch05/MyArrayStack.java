package ch05;

import ch03.MyArray;

public class MyArrayStack {

	int top;
	MyArray arrayStack; 
	
	public MyArrayStack()
	{	// ����Ʈ �ʱ�ȭ�ϸ�, 10��¥�� Array�� ��������Ƿ� �Ʒ�ó�� ���ֱ�
		top = 0;
		arrayStack = new MyArray();
	}
	
	public MyArrayStack(int size)
	{
		arrayStack = new MyArray(size);
	}
	
	// ������ ����
	public void push(int data)
	{
		// ������ �� �� ��� => error
		if(isFull()){
			System.out.println("stack is full");
			return /* MyArray.ERROR_NUM */;
		}
		// �迭�� �������� ������ �߰�
		arrayStack.addElement(data);
		top++;
	}
	
	// ������ ������
	public int pop()
	{
		// ������ �� ���
		if (top == 0){
			System.out.println("stack is empty");
			return MyArray.ERROR_NUM;
		}
		// �����ϸ� top(element�� ����)�� �ϳ� �پ��� ������  =>  --top
		return arrayStack.removeElement(--top);
		
	}
	
	// ������ Ȯ��
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
	
	// ������ �� á�� �� Ȯ��
	public boolean isFull()
	{
		// top : element�� ����  => ������ �� á�� �� Ȯ�� ����
		if(top == arrayStack.ARRAY_SIZE){ // �� �� ���
			return true;
		}
		else return false;
	}
	
	// ������ ����� �� Ȯ��
	public boolean isEmpty()
	{
		// top : element�� ���� 
		if (top == 0){ // �� ���
			return true;
		}
		else return false;
	}
	
	public void printAll()
	{
		arrayStack.printAll();
	}
}
