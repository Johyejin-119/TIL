package ch11;

import java.util.ArrayList;
import java.util.Iterator;

// Iterator 사용하기
public class MemberArrayListIterator {

	private ArrayList<Member> arrayList;
	
	public MemberArrayListIterator() {
		arrayList = new ArrayList<>();
	}	

	public MemberArrayListIterator(int size) {
		arrayList = new ArrayList<>(size);
	}	
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// Iterator
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			
			Member member = ir.next();
			int tempId = member.getMemberId();
			if( tempId == memberId ) {
				arrayList.remove(member); // index말고 Object로 지정  => member
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
