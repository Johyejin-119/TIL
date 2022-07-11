package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

// User에 대한 DB 운영(Operation)할때 구현해야될 기능은 무엇 무엇이다라고, 각 버전에 맞게 구현

public interface UserInfoDao {
	void insertUserIfo(UserInfo userInfo);
	void updateUserIfo(UserInfo userInfo);
	void deleteUserIfo(UserInfo userInfo);
	
}
