package ch10;

import java.util.ArrayList;

public class MemberArrayList {
  
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}	

	public MemberArrayList(int size) {
		arrayList = new ArrayList<>(size);
	}	
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for(int i = 0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			
			int tempId = member.getMemberId();
			if(tempId == memberId) { // 기존 member의 id값과 삭제할 member의 id값이 같으면 remove
				arrayList.remove(i);
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
