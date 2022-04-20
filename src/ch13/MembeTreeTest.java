package ch13;

import java.util.TreeSet;

public class MembeTreeTest {

	public static void main(String[] args) {
/*		// String은 compareTo가 이미 구현되어 있음

 		TreeSet<String> set = new TreeSet<String>();
		// 들어가는 순서는 중요하지 않음 => 나올 때 정렬됨
		set.add("홍길동");
		set.add("강감찬");
		set.add("이순신");
		
		System.out.println(set); // ㄱㄴㄷ정렬되서 출력
*/
		
		// MemberTree는 compareTo를 따로 구현해야 함
		MemberTreeSet MemberTreeSet = new MemberTreeSet();
		
		Member memberhong = new Member(1004, "홍길동");
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");

		MemberTreeSet.addMember(memberhong);
		MemberTreeSet.addMember(memberLee);
		MemberTreeSet.addMember(memberKim);
		MemberTreeSet.addMember(memberKang);
		
		MemberTreeSet.showAllMember();
	
	}

}
