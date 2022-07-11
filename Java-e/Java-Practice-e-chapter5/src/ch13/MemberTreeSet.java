package ch13;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member()); // Comparator은 <>,()안에 값을 넣어야한다
	}	
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			
			Member member = ir.next();
			int tempId = member.getMemberId();
			if( tempId == memberId ) {
				treeSet.remove(member); // index말고 Object로 지정  => member
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
