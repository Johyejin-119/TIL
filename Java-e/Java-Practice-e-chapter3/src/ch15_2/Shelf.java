package ch15_2;

import java.util.ArrayList;

// 책선반
public class Shelf {

	// 자료구조 ArrayList
	protected ArrayList<String> shelf; // 상속받을 수 있으므로 protected
	
	// 생성자 호출될 때 멤버변수 초기화
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
