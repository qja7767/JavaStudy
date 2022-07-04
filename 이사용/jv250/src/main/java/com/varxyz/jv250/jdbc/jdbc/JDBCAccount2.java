package com.varxyz.jv250.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCAccount2 {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		
		try {
			Class.forName(driver);
			System.out.println("LOADED DRIVER --->" + driver);
			
			Connection con = DriverManager.getConnection(url, id, passwd);
			System.out.println("CONNECTED TO --->" + url);
			
			String sql = "SELECT * FROM Account WHERE aid = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, "3003");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				long aid = rs.getLong("aid");
				String accountNum = rs.getString("accountNum");
				String balance = rs.getString("balance");		
				System.out.println(aid);
				System.out.println(accountNum);
				System.out.println(balance);
				System.out.println("-----------------------");
			}
			rs.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) { // 이걸로 퉁치기 가능
			e.printStackTrace();
		} finally {
			}
		}
	}