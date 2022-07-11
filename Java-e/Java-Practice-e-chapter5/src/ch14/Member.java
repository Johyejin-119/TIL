package ch14;

public class Member {
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
		// this.memberId와 동일
		// 실질적인 메모리는 달라도, 같은 멤버변수 같은 객체를 가질 때 동일한 hashCode 가지는 것이 좋음
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj; // 객체 타입이 Member면, obj 다운 캐스팅
			if( this.memberId == member.memberId) {
				return true;
			}
			else return false;
		}
		return false;
	}


	public String toString() { // toString 메소드 오버로딩
		return memberName + " 회원님의 아이디는 " + memberId + "입니다";
	}
}
