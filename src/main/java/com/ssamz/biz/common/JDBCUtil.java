package com.ssamz.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	
	public static Connection getConnection() { // getConnection�� Ŀ�ؼ� ��ü�ϳ� conn ���� 
		Connection conn = null;
		try {
			// JDBC 1�ܰ� : ����̹� ��ü �ε�			
			DriverManager.registerDriver(new org.h2.Driver());
			
			// JDBC 2�ܰ� : Ŀ�ؼ� ����
			conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(PreparedStatement stmt, Connection conn) {
		// JDBC 5�ܰ� : ���� ����
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// select������ resultset ����
	public static void close(ResultSet rs, PreparedStatement stmt, 
			Connection conn) {
				// JDBC 5�ܰ� : ���� ����
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

}
