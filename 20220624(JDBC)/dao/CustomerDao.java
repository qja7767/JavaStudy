package com.varxyz.jv251.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv251.domain.Customer;

public class CustomerDao {
	
	public CustomerDao() {
		
	}
	/**
	 * 전체 고객 정보 조회
	 * @return
	 */
	public List<Customer> findAllCustomers(){
		String sql = "SELECT * FROM Customer";
		List<Customer> customerList = new ArrayList<Customer>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DataSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Customer c = new Customer();
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setUserId(rs.getString("userId"));
					c.setPasswd(rs.getString("passwd"));
					customerList.add(c);
				}
			}finally {
				DataSourceManager.close(rs,  pstmt,  con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return customerList;
	}
	
	/**
	 * 주민번호로 고객조회
	 * @param ssn
	 * @return
	 */
	public Customer findCustomerBySsn(String ssn) {
		String sql = "SELECT * FROM Customer WHERE ssn = ?";	
		Customer c = null; //null로 처리vs예외로 처리
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DataSourceManager.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					c = new Customer();					
					c.setCid(rs.getLong("cid"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setUserId(rs.getString("userId"));
					c.setPasswd(rs.getString("passwd"));
				}
			}finally {
				DataSourceManager.close(rs,  pstmt,  con);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}		
		return c;
	}
	/**
	 * 신규 고객 등록
	 * @param customer			등록할 고객정보
	 */
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer(name, ssn, phone, customerId, passwd) "
				+ " VALUES(?, ?, ?, ?, ?)";
		try {
			Connection con = DataSourceManager.getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getSsn());;
			pstmt.setString(3, customer.getPhone());
			pstmt.setString(4, customer.getUserId());
			pstmt.setString(5, customer.getPasswd());
			pstmt.executeUpdate();
			con.close();
			System.out.println("INSERTED....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
