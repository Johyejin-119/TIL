package ch07pratice;

public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo userInfo1 = new UserInfo(); // ����Ʈ �����ڷ� ���� ���� �� �ֱ�
		userInfo1.userId = "jo";
		userInfo1.userName = "������";
		userInfo1.userPassword ="jopass";
		userInfo1.address = "��⵵ ������";
		userInfo1.phoneNumber = "010-0000-0000";
		
		System.out.println(userInfo1.showUserInfo());
		
		
		UserInfo userInfo2 = new UserInfo("lee", "������", "leepass", "��⵵ ���ν�", "010-1234-5678"); // �Ű����� ���� �־
		System.out.println(userInfo2.showUserInfo());

	}

}
