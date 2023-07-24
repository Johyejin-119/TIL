package ch04;

/* LinkedList 방식 2가지
	1. head 노드를 맨 앞 노드 -> 다음 노드 -> 다음 노드 ...
	2. haed 포인터로 더미 노드 -> 맨 앞 노드 -> 다음 노드 ...

	아래 코드는 1번 방식
*/

public class MyLinkedList {

	private MyListNode head; // 첫 번째 element
	int count; // List에 연결된 element 개수
	
	// head가 맨 앞의 노드인지 한 번 체크
	public MyLinkedList()
	{
		head = null;
		count = 0;
	}

	
/* 삽입 방식
	1. 삽입할 위치의 preNode를 찾고(중요-삭제할때도 마찬가지)
	2. preNode의 Link를 삽입할 노드로
	3. 삽입할 노드의 Link를 nextNode로
	
	insert할 index의 전 노드 = preNode
	insert할 index의 다음 노드 = nextNode

*/

	// 노드 삽입
	public MyListNode addElement( String data )
	{
		
		MyListNode newNode; // 새로운 노드 생성
		
		// head가 맨 처음일 때
		if(head == null){
			newNode = new MyListNode(data);
			head = newNode; // head에 첫 번째 노드 생성
		}
		// 맨 뒤에 노드 삽입할 때
		else{
			newNode = new MyListNode(data);
			MyListNode temp = head; // head 노드부터
			while(temp.next != null) // 맨 마지막 노드까지 
				temp = temp.next; // 다음 노드(next)를 계속해서 가리키고
			temp.next = newNode; // 다음 노드(next)가 null인 노드에 newNode 삽입
		}
		count++;
		return newNode;
	}
	
	// 중간에 노드 삽입
	public MyListNode insertElement(int position, String data )
	{
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data); // 추가할 노드
		
		if(position < 0 || position > count ){
			System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 앞으로 들어가는 경우
			newNode.next = head;
			head = newNode;
		}
		else{
			MyListNode preNode = null;	
			// 우선 preNode의 위치 찾기
			for(i=0; i<position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			// preNode를 기준으로 노드 삽입
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}
	
	// 노드 삭제
	public MyListNode removeElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		 // 맨 앞을 삭제하는 경우  =>  head가 삭제할 노드인 경우
		if(position == 0){ 
			head = tempNode.next; // 삭제할 노드의 다음 노드를 head로
		}
		// 중간에서 삭제하는 경우
		else{
			// 우선 preNode의 위치 찾기
			MyListNode preNode = null;	
			for(i=0; i<position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			// 삭제할 노드의 다음 노드를 preNode.next로
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position + "번째 항목 삭제되었습니다.");
		
		return tempNode;
	}
	
	public String getElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error");
		}
		
		if(position == 0){  //맨 인 경우

			return head.getData();
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode.getData();
	}

	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 인 경우

			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
	}

	public void removeAll()
	{
		head = null;
		count = 0;
		
	}
	
	public int getSize()
	{
		return count;
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
	}
	
}
