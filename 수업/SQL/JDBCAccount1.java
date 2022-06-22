package com.varxyz.jv250.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCAccount1 {
	
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
		String id = "jv250";
		String passwd = "jv250";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;	
				
		try {
			Class.forName(driver);
			System.out.println("LOADED DRIVER --->" + driver);
			
			con = DriverManager.getConnection(url, id, passwd);
			System.out.println("CONNECTED TO --->" + url);
			
			String sql = "SELECT * FROM Account WHERE aid='3001'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				long aid = rs.getLong("aid");
				String accountNum = rs.getString("accountNum");
				String balance = rs.getString("balance");				
				System.out.println(aid);
				System.out.println(accountNum);
				System.out.println(balance);				
				System.out.println("-----------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ( rs != null)
				try {rs.close();} catch (SQLException e) {e.printStackTrace();}
			if ( stmt != null) 
				try {stmt.close();} catch (SQLException e) {e.printStackTrace();}
			if ( con != null)
				try {con.close();} catch (SQLException e) {e.printStackTrace();}
			}
		}
	}
