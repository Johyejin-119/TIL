package ch13;

import java.util.TreeSet;

public class MembeTreeTest {

	public static void main(String[] args) {
/*		// String�� compareTo�� �̹� �����Ǿ� ����

 		TreeSet<String> set = new TreeSet<String>();
		// ���� ������ �߿����� ���� => ���� �� ���ĵ�
		set.add("ȫ�浿");
		set.add("������");
		set.add("�̼���");
		
		System.out.println(set); // ���������ĵǼ� ���
*/
		
		// MemberTree�� compareTo�� ���� �����ؾ� ��
		MemberTreeSet MemberTreeSet = new MemberTreeSet();
		
		Member memberhong = new Member(1004, "ȫ�浿");
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1002, "������");
		Member memberKang = new Member(1003, "������");

		MemberTreeSet.addMember(memberhong);
		MemberTreeSet.addMember(memberLee);
		MemberTreeSet.addMember(memberKim);
		MemberTreeSet.addMember(memberKang);
		
		MemberTreeSet.showAllMember();
	
	}

}
