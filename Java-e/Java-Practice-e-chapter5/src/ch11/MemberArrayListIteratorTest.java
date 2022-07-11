package ch11;

public class MemberArrayListIteratorTest {
 
	public static void main(String[] args) {

		MemberArrayListIterator memberArrayListIterator = new MemberArrayListIterator();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");
		Member memberHong = new Member(1004, "홍길동");


		memberArrayListIterator.addMember(memberLee);
		memberArrayListIterator.addMember(memberKim);
		memberArrayListIterator.addMember(memberKang);
		memberArrayListIterator.addMember(memberHong);
		
		memberArrayListIterator.showAllMember(); 
		
		memberArrayListIterator.removeMember(memberKim.getMemberId());
		memberArrayListIterator.showAllMember(); 
	}

}
