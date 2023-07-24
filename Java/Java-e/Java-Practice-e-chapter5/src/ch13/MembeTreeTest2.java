package ch13;

import java.util.Comparator;
import java.util.TreeSet;

// �̹� Comparable�� ������ ��� Comparator�� ���ϴ� ����� �ٽ� �����ϴ� ���
class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) *(-1); // ���� String�� ������ ���� // -1 ��������
	}
	
}

public class MembeTreeTest2 {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>(new MyCompare());
		set.add("Park");
		set.add("Kim");
		set.add("Lee");
		System.out.println(set);
	}

}
