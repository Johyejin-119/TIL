package ch07pratice;

public class UserInfo {
	public String userId;
	public String userName;
	public String userPassword;
	public String address;
	public String phoneNumber;
	
	public UserInfo() {};
	public UserInfo(String userId, String userName, String userPassword, String address, String phoneNumber) { // �Ű��������� ��������
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String showUserInfo() {
		return "������ ���̵�� " + userId + "�̰�, ��ϵ� �̸��� " + userName + "�Դϴ�.";
	}
	
}
