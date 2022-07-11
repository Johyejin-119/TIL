package ch04;

public class MyListNode {

	public String data;       // 자료
	public MyListNode next;    // 다음 노드를 가리키는 링크
	
	// 아무 것도 없을 때 생성되는 방식
	public MyListNode(){
		data = null;
		next = null;
	}
	
	// data가 들어올 때 생성되는 방식
	public MyListNode(String data){
		this.data = data;
		this.next = null; // 들어온 data의 next(다음을 가리켜주는 값)는 일단 null
	}
	
	// data와 next도 들어올 때 생성되는 방식
	public MyListNode(String data, MyListNode link){
		this.data = data;
		this.next = link;
	}
	
	public String getData(){
		return data;
	}
}
