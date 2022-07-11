package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserinfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

// 타입을 읽어들여서, 타입이 오라클이면 오라클을 Mysql이면 Mysql을 읽게
// db.properties 파일에 DBTYPE=MYSQL   =>   MYSQL이나 ORACLE 버전으로 돌아가겠다고 한 것

public class UserInfoClient {
	// UserInfoDao.java 인터페이스 파일만 보고 작성하면 됨
	// 굳이 다른 파일(UserinfoMySqlDao, UserInfoOracleDao)은 보지 않아도 됨

	public static void main(String[] args) throws IOException {
		// 읽어들일 때
		FileInputStream fis = new FileInputStream("db.properties");
		
		// Properties  =>  DBTYPE=MYSQL처럼 쌍으로 되어있는 애들을 쌍으로 읽어들일 수 있는 객체(ex. id=01, password=11)
		Properties prop = new Properties(); 
		prop.load(fis);

		String dbType = prop.getProperty("DBTYPE"); // DBTYPE에 해당되는 value 반환
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("조디비");

		UserInfoDao userInfoDao = null; // 처음엔 아직 아무 값이 안들어있으므로 null
		
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
		
		// 값 넣기
		userInfoDao.insertUserIfo(userInfo);
		userInfoDao.updateUserIfo(userInfo);
		userInfoDao.deleteUserIfo(userInfo);
			
	}

}
