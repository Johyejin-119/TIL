package ch04;

public class MyListNode {

	public String data;       // �ڷ�
	public MyListNode next;    // ���� ��带 ����Ű�� ��ũ
	
	// �ƹ� �͵� ���� �� �����Ǵ� ���
	public MyListNode(){
		data = null;
		next = null;
	}
	
	// data�� ���� �� �����Ǵ� ���
	public MyListNode(String data){
		this.data = data;
		this.next = null; // ���� data�� next(������ �������ִ� ��)�� �ϴ� null
	}
	
	// data�� next�� ���� �� �����Ǵ� ���
	public MyListNode(String data, MyListNode link){
		this.data = data;
		this.next = link;
	}
	
	public String getData(){
		return data;
	}
}
