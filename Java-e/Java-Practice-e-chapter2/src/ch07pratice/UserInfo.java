package ch07pratice;

public class UserInfo {
	public String userId;
	public String userName;
	public String userPassword;
	public String address;
	public String phoneNumber;
	
	public UserInfo() {};
	public UserInfo(String userId, String userName, String userPassword, String address, String phoneNumber) { // 매개변수이자 지역변수
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String showUserInfo() {
		return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다.";
	}
	
}
