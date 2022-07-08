package com.varxyz.jv300.mod010;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
	private DataSource dataSource;
	public UserDao() {
		NamingService ns = NamingService.getInstance();
		dataSource = (DataSource)ns.getAttribute("dataSource");
	}
	
	//ADD_USER
	public void plusUser(User user) {
		String sql = "INSERT INTO UserList (userId, passwd, userName, ssn, email, addr)"
				 + " VALUES (?, ?, ?, ?, ?, ?)";
		try {		
			Connection con = null;
			PreparedStatement pstmt = null;	
			try {
				con = dataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getUserId());
				pstmt.setString(2, user.getPasswd());
				pstmt.setString(3, user.getUserName());
				pstmt.setString(4, user.getSsn());
				pstmt.setString(5, user.getEmail());
				pstmt.setString(6, user.getAddr());
				pstmt.executeUpdate();
			} finally {
				dataSource.close(pstmt, con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//UPDATE_USER
	public void updateUser(User user) { 
		String sql = "UPDATE UserList SET passwd = ?, userName = ? WHERE userId = ?";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = dataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getPasswd());
				pstmt.setString(2, user.getUserName());
				pstmt.setString(3, user.getUserId());
				pstmt.executeUpdate();
			} finally {
				dataSource.close(rs, pstmt, con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//DELETE_USER by userId
	public void deleteUserByUserId(User user) {
		String sql = "DELETE FROM UserList WHERE userId = ?";		
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = dataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getUserId());
				pstmt.executeUpdate();
			} finally {
				dataSource.close(rs, pstmt, con);
			}
		} catch ( SQLException e) {
			e.printStackTrace();
		}
	}
	
	//FIND_USER
	public List<User> findAllUser() {
		String sql = "SELECT * FROM UserList";
		List<User> userList = new ArrayList<User>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;	
			ResultSet rs = null;
			try {
				con = dataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					User c = new User();
					c.setUserId(rs.getString("userId"));
					c.setPasswd(rs.getString("passwd"));
					c.setUserName(rs.getString("userName"));
					c.setSsn(rs.getString("ssn"));
					c.setEmail(rs.getString("email"));
					c.setAddr(rs.getString("addr"));
					userList.add(c);
				}
			}finally {
				dataSource.close(rs, pstmt, con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}
	
	public boolean isValidUser(String userId, String passwd) {
		String sql = "SELECT * FROM userList WHERE userId=? AND passwd=?";
		boolean bool = true;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = dataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, userId);
				pstmt.setString(2, passwd);
				rs = pstmt.executeQuery();
				if(!rs.next()) {
					bool = false;
				}
			} finally {
				dataSource.close(rs, pstmt, con);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}			
		return bool;		
	}
	
	
	
}
