package ch14;

import java.util.HashMap;

public class MembeHashMapTest {

	public static void main(String[] args) {

		MemberHashMap MemberHashMap = new MemberHashMap();
		
		Member memberhong = new Member(1004, "ȫ�浿");
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");

		MemberHashMap.addMember(memberhong);
		MemberHashMap.addMember(memberLee);
		MemberHashMap.addMember(memberKim);
		MemberHashMap.addMember(memberKang);
		
		MemberHashMap.showAllMember();
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1001, "Kim");
		hashMap.put(1002, "Lee");
		hashMap.put(1003, "Park");
		hashMap.put(1004, "Hong");
		System.out.println(hashMap); // hashMap�� key-value ������ ����
	
	}

}
