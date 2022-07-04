package com.varxyz.jv250.jdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCExample {
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
			
			String sql = "SELECT * FROM Customer WHERE name='유비'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				long cid = rs.getLong("cid");
				String customerId = rs.getString("customerId");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				System.out.println(cid);
				System.out.println(customerId);
				System.out.println(name);
				System.out.println(phone);
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
