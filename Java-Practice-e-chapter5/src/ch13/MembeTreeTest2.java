package ch13;

import java.util.Comparator;
import java.util.TreeSet;

// 이미 Comparable이 구현된 경우 Comparator로 비교하는 방식을 다시 구현하는 방법
class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2) *(-1); // 원래 String의 구현과 동일 // -1 내림차순
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
