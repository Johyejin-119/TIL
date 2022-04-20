package ch13;

// id 별로 오름차순 정렬된 Tree
public class Member implements Comparable<Member>{
	private int memberId; // 회원 아이디
	private String memberName; // 회원 이름
	
	
	public Member(int memberId, String memberName) { // 생성자
		this.memberId = memberId;
		this.memberName = memberName;
	}


	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	
	@Override
	public int hashCode() {
		return memberId; 
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj; 
			if( this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}


	public String toString() { 
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}


	/* public int compareTo(Member member)
	
	
	* implements Comparable<Member>이기때문에 Member 타입으로 매개변수 받음
	* compareTo() : CallBack 함수 
	* member : 이미 트리 구성하던 애들을 하나씩 넘겨받는 변수
	
	=>	트리에 member가 자리를 잡을 때까지
		내 자신의 id(this.memberId)와 비교
	 
	* CallBack 함수란? 내가 호출하는 것이 아니고, 시스템이 호출해주는 함수
	
	 
	*/
	/* 내 id(this.memberId)가 더 크면 양수, 아니면 음수, 같으면 0 반환
	 
	 left는 더 작은 값
	 right는 더 큰 값
	 
	 서로 비교하면서 오름차순 정렬되어 트리 구성
	 
	*/	
	@Override
	public int compareTo(Member member) {

		if(this.memberId > member.memberId)
			return 1; // -1 역순(왼쪽 더 큰 값)
		else if (this.memberId < member.memberId)
			return -1; // 1 역순(오른쪽 더 작은 값)
		else return 0;
		
		
		// 위 코드 간단하게 오름차순/내림차순
		// return (this.memberId - member.memberId);
		// return (this.memberId - member.memberId) * (-1);
	}
}
