package ch03;

public class MyArray {

	int[] intArr;   	//int array // 커패시터 (capacitor): array 용량 => 다쓰면 더 큰 배열을 잡아서 복사함
	int count;  		//개수
		
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	// 아무 조건 없이 Array잡을 때, size 10
	public MyArray()
	{
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	// size 지정해서 Array 잡을 때
	public MyArray(int size)
	{
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	// 데이터 추가
	public void addElement(int num)
	{
		if(count >= ARRAY_SIZE){
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
				
	}

	// 배열 중간에 데이터 추가
	/* 방법
	1. 맨 마지막에 있는 요소부터 position까지 이 순서대로(역순) 
	2. 하나씩 뒤로 옮겨서 삽입할 공간 만들고
	3. 빈 공간에 데이터(num)를 삽입한다
	
	맨 마지막 위치(index) = 전체 요소 개수(count) - 삽입할 위치(index)
	
	*/
	public void insertElement(int position, int num) // position 삽입 위치(index 값), num 삽입 데이터(넣으려는 element)
	{
		int i;
		
		// 배열이 꽉차서 더이상 삽입 불가한 경우
		if(count >= ARRAY_SIZE){ 
			System.out.println("not enough memory");
			return;
		}
		
		// index error인 경우  =>  position이 0 이하거나 count(배열크기)보다 클 순 없다
		if(position < 0 || position > count ){ // index의 최대는 count-1 이지만, 다음 index에 삽입 가능하므로 count
			System.out.println("insert Error");
			return;
		}
		
		// 배열 마지막 인덱스(count-1)부터 position까지 차례대로 하나씩 뒤로 이동
		for( i = count-1; i >= position ; i--){
			intArr[i+1]  = intArr[i]; 
		}
		
		intArr[position] = num; // 원하는 위치에 데이터 삽입
		count++;
	}
	
	
	
	// 배열에서 데이터 삭제
	/* 방법
	1. position에 위치한 데이터 지우고
	2. 빈 공간을 채우기 위해, 앞으로 한 칸씩 옮겨줘야 한다
	
	*/
	public int removeElement(int position)
	{
		/* 반환값 ret 
			에러 났을 때 -> ERROR_NUM 
			에러 안났을 때 -> position
		*/
		int ret = ERROR_NUM; 
		
		// 비어있으면 삭제 불가
		if( isEmpty() ){
			System.out.println("There is no element");
			return ret;
		}
		
		// index error인 경우 
		if(position < 0 || position >= count-1 ){ // index의 최대는 count-1
			System.out.println("remove Error");
			return ret;
		}
		
		
		ret = intArr[position];
		
		for(int i = position; i<count -1; i++ )
		{
			intArr[i] = intArr[i+1]; // 하나씩 앞으로 이동
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
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
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
