package ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {

		MemberHashSet MemberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");


		MemberHashSet.addMember(memberLee);
		MemberHashSet.addMember(memberKim);
		MemberHashSet.addMember(memberKang);
		
		MemberHashSet.showAllMember();
		
		// hashCode() equals()�� Member.java�� �������̵��� �ȵǾ� ������? id �ߺ��Ǽ� ����
		Member memberhong = new Member(1003, "ȫ�浿");
		MemberHashSet.addMember(memberhong);

		MemberHashSet.showAllMember(); // �� ������� ������� ����

	}

}
