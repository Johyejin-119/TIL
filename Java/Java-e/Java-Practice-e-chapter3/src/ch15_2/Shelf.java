package ch15_2;

import java.util.ArrayList;

// å����
public class Shelf {

	// �ڷᱸ�� ArrayList
	protected ArrayList<String> shelf; // ��ӹ��� �� �����Ƿ� protected
	
	// ������ ȣ��� �� ������� �ʱ�ȭ
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
