package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserinfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

// Ÿ���� �о�鿩��, Ÿ���� ����Ŭ�̸� ����Ŭ�� Mysql�̸� Mysql�� �а�
// db.properties ���Ͽ� DBTYPE=MYSQL   =>   MYSQL�̳� ORACLE �������� ���ư��ڴٰ� �� ��

public class UserInfoClient {
	// UserInfoDao.java �������̽� ���ϸ� ���� �ۼ��ϸ� ��
	// ���� �ٸ� ����(UserinfoMySqlDao, UserInfoOracleDao)�� ���� �ʾƵ� ��

	public static void main(String[] args) throws IOException {
		// �о���� ��
		FileInputStream fis = new FileInputStream("db.properties");
		
		// Properties  =>  DBTYPE=MYSQLó�� ������ �Ǿ��ִ� �ֵ��� ������ �о���� �� �ִ� ��ü(ex. id=01, password=11)
		Properties prop = new Properties(); 
		prop.load(fis);

		String dbType = prop.getProperty("DBTYPE"); // DBTYPE�� �ش�Ǵ� value ��ȯ
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("�����");

		UserInfoDao userInfoDao = null; // ó���� ���� �ƹ� ���� �ȵ�������Ƿ� null
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}
		else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserinfoMySqlDao();
		}
		else {
			System.out.println("db error");
			return;
		}
		
		// �� �ֱ�
		userInfoDao.insertUserIfo(userInfo);
		userInfoDao.updateUserIfo(userInfo);
		userInfoDao.deleteUserIfo(userInfo);
			
	}

}
