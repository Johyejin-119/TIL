package ch13;

import java.util.Comparator;

// id ���� �������� ���ĵ� Tree
// implements Comparable<Member>
public class Member implements Comparator<Member>{  
	private int memberId; // ȸ�� ���̵�
	private String memberName; // ȸ�� �̸�
	
	public Member() {} // Comparator ������
	
	public Member(int memberId, String memberName) { // ������
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
		return memberName + " ȸ������ ���̵�� " + memberId + "�Դϴ�";
	}


	/* public int compareTo(Member member)
	
	
	* implements Comparable<Member>�̱⶧���� Member Ÿ������ �Ű����� ����
	* compareTo() : CallBack �Լ� 
	* member : �̹� Ʈ�� �����ϴ� �ֵ��� �ϳ��� �Ѱܹ޴� ����
	
	=>	Ʈ���� member�� �ڸ��� ���� ������
		�� �ڽ��� id(this.memberId)�� ��
	 
	* CallBack �Լ���? ���� ȣ���ϴ� ���� �ƴϰ�, �ý����� ȣ�����ִ� �Լ�
	
	 
	*/
	/* �� id(this.memberId)�� �� ũ�� ���, �ƴϸ� ����, ������ 0 ��ȯ
	 
	 left�� �� ���� ��
	 right�� �� ū ��
	 
	 ���� ���ϸ鼭 �������� ���ĵǾ� Ʈ�� ����
	 
	*/	
		
	/* Comparable ���� ���ϴ� �޼ҵ�
	@Override
	public int compareTo(Member member) {

		if(this.memberId > member.memberId)
			return 1; // -1 ����(���� �� ū ��)
		else if (this.memberId < member.memberId)
			return -1; // 1 ����(������ �� ���� ��)
		else return 0;
		
		
		// �� �ڵ� �����ϰ� ��������/��������
		// return (this.memberId - member.memberId);
		// return (this.memberId - member.memberId) * (-1);
	}
*/

	// Comparator ���� �񱳴��� ���ϴ� �޼ҵ�
	@Override
	public int compare(Member member1, Member member2) {
		return (member1.memberId - member2.memberId);
	}
}
