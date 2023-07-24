package ch03;

public class MyArray {

	int[] intArr;   	//int array // Ŀ�н��� (capacitor): array �뷮 => �پ��� �� ū �迭�� ��Ƽ� ������
	int count;  		//����
		
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	// �ƹ� ���� ���� Array���� ��, size 10
	public MyArray()
	{
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	// size �����ؼ� Array ���� ��
	public MyArray(int size)
	{
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	// ������ �߰�
	public void addElement(int num)
	{
		if(count >= ARRAY_SIZE){
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
				
	}

	// �迭 �߰��� ������ �߰�
	/* ���
	1. �� �������� �ִ� ��Һ��� position���� �� �������(����) 
	2. �ϳ��� �ڷ� �Űܼ� ������ ���� �����
	3. �� ������ ������(num)�� �����Ѵ�
	
	�� ������ ��ġ(index) = ��ü ��� ����(count) - ������ ��ġ(index)
	
	*/
	public void insertElement(int position, int num) // position ���� ��ġ(index ��), num ���� ������(�������� element)
	{
		int i;
		
		// �迭�� ������ ���̻� ���� �Ұ��� ���
		if(count >= ARRAY_SIZE){ 
			System.out.println("not enough memory");
			return;
		}
		
		// index error�� ���  =>  position�� 0 ���ϰų� count(�迭ũ��)���� Ŭ �� ����
		if(position < 0 || position > count ){ // index�� �ִ�� count-1 ������, ���� index�� ���� �����ϹǷ� count
			System.out.println("insert Error");
			return;
		}
		
		// �迭 ������ �ε���(count-1)���� position���� ���ʴ�� �ϳ��� �ڷ� �̵�
		for( i = count-1; i >= position ; i--){
			intArr[i+1]  = intArr[i]; 
		}
		
		intArr[position] = num; // ���ϴ� ��ġ�� ������ ����
		count++;
	}
	
	
	
	// �迭���� ������ ����
	/* ���
	1. position�� ��ġ�� ������ �����
	2. �� ������ ä��� ����, ������ �� ĭ�� �Ű���� �Ѵ�
	
	*/
	public int removeElement(int position)
	{
		/* ��ȯ�� ret 
			���� ���� �� -> ERROR_NUM 
			���� �ȳ��� �� -> position
		*/
		int ret = ERROR_NUM; 
		
		// ��������� ���� �Ұ�
		if( isEmpty() ){
			System.out.println("There is no element");
			return ret;
		}
		
		// index error�� ��� 
		if(position < 0 || position >= count-1 ){ // index�� �ִ�� count-1
			System.out.println("remove Error");
			return ret;
		}
		
		
		ret = intArr[position];
		
		for(int i = position; i<count -1; i++ )
		{
			intArr[i] = intArr[i+1]; // �ϳ��� ������ �̵�
		}
		count--;
		return ret;
	}
	
	public int getSize()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		if(count == 0){
			return true;
		}
		else return false;
	}
	
	public int getElement(int position)
	{
		if(position < 0 || position > count-1){
			System.out.println("�˻� ��ġ ����. ���� ����Ʈ�� ������ " + count +"�� �Դϴ�.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("����� ������ �����ϴ�.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}
		
	}
	
	public void removeAll()
	{
		for(int i=0; i<count; i++){
			intArr[i] = 0;
		}
		count = 0;
	}
}
