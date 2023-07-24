package ch04;

/* LinkedList ��� 2����
	1. head ��带 �� �� ��� -> ���� ��� -> ���� ��� ...
	2. haed �����ͷ� ���� ��� -> �� �� ��� -> ���� ��� ...

	�Ʒ� �ڵ�� 1�� ���
*/

public class MyLinkedList {

	private MyListNode head; // ù ��° element
	int count; // List�� ����� element ����
	
	// head�� �� ���� ������� �� �� üũ
	public MyLinkedList()
	{
		head = null;
		count = 0;
	}

	
/* ���� ���
	1. ������ ��ġ�� preNode�� ã��(�߿�-�����Ҷ��� ��������)
	2. preNode�� Link�� ������ ����
	3. ������ ����� Link�� nextNode��
	
	insert�� index�� �� ��� = preNode
	insert�� index�� ���� ��� = nextNode

*/

	// ��� ����
	public MyListNode addElement( String data )
	{
		
		MyListNode newNode; // ���ο� ��� ����
		
		// head�� �� ó���� ��
		if(head == null){
			newNode = new MyListNode(data);
			head = newNode; // head�� ù ��° ��� ����
		}
		// �� �ڿ� ��� ������ ��
		else{
			newNode = new MyListNode(data);
			MyListNode temp = head; // head ������
			while(temp.next != null) // �� ������ ������ 
				temp = temp.next; // ���� ���(next)�� ����ؼ� ����Ű��
			temp.next = newNode; // ���� ���(next)�� null�� ��忡 newNode ����
		}
		count++;
		return newNode;
	}
	
	// �߰��� ��� ����
	public MyListNode insertElement(int position, String data )
	{
		int i;
		MyListNode tempNode = head;
		MyListNode newNode = new MyListNode(data); // �߰��� ���
		
		if(position < 0 || position > count ){
			System.out.println("�߰� �� ��ġ ���� �Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return null;
		}
		
		if(position == 0){  //�� ������ ���� ���
			newNode.next = head;
			head = newNode;
		}
		else{
			MyListNode preNode = null;	
			// �켱 preNode�� ��ġ ã��
			for(i=0; i<position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			// preNode�� �������� ��� ����
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		count++;
		return newNode;
	}
	
	// ��� ����
	public MyListNode removeElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("���� �� ��ġ �����Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return null;
		}
		
		 // �� ���� �����ϴ� ���  =>  head�� ������ ����� ���
		if(position == 0){ 
			head = tempNode.next; // ������ ����� ���� ��带 head��
		}
		// �߰����� �����ϴ� ���
		else{
			// �켱 preNode�� ��ġ ã��
			MyListNode preNode = null;	
			for(i=0; i<position; i++){
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			// ������ ����� ���� ��带 preNode.next��
			preNode.next = tempNode.next;
		}
		count--;
		System.out.println(position + "��° �׸� �����Ǿ����ϴ�.");
		
		return tempNode;
	}
	
	public String getElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("�˻� ��ġ ���� �Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return new String("error");
		}
		
		if(position == 0){  //�� �� ���

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
			System.out.println("�˻� ��ġ ���� �Դϴ�. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return null;
		}
		
		if(position == 0){  //�� �� ���

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
			System.out.println("����� ������ �����ϴ�.");
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
