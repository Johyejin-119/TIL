package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserinfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserIfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userID = " + userInfo.getUserId());
	}

	@Override
	public void updateUserIfo(UserInfo userInfo) {
		System.out.println("Update into MySQL DB userID = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserIfo(UserInfo userInfo) {
		System.out.println("Delete from MySQL DB userID = " + userInfo.getUserId());

	}

}
