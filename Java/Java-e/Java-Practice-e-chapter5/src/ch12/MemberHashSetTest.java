package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet MemberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");


		MemberHashSet.addMember(memberLee);
		MemberHashSet.addMember(memberKim);
		MemberHashSet.addMember(memberKang);
		
		MemberHashSet.showAllMember();
		
		// hashCode() equals()가 Member.java에 오버라이딩이 안되어 있으면? id 중복되서 삽입
		Member memberhong = new Member(1003, "홍길동");
		MemberHashSet.addMember(memberhong);

		MemberHashSet.showAllMember(); // 들어간 순서대로 출력하진 않음

	}

}
