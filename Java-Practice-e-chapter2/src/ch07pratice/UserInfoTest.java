package ch07pratice;

public class UserInfoTest {

	public static void main(String[] args) {

		UserInfo userInfo1 = new UserInfo(); // 디폴트 생성자로 각각 변수 값 넣기
		userInfo1.userId = "jo";
		userInfo1.userName = "조혜진";
		userInfo1.userPassword ="jopass";
		userInfo1.address = "경기도 수원시";
		userInfo1.phoneNumber = "010-0000-0000";
		
		System.out.println(userInfo1.showUserInfo());
		
		
		UserInfo userInfo2 = new UserInfo("lee", "이혜진", "leepass", "경기도 용인시", "010-1234-5678"); // 매개변수 직접 넣어서
		System.out.println(userInfo2.showUserInfo());

	}

}
