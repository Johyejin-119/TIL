package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

// User�� ���� DB �(Operation)�Ҷ� �����ؾߵ� ����� ���� �����̴ٶ��, �� ������ �°� ����

public interface UserInfoDao {
	void insertUserIfo(UserInfo userInfo);
	void updateUserIfo(UserInfo userInfo);
	void deleteUserIfo(UserInfo userInfo);
	
}
