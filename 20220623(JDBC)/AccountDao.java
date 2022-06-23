package com.varxyz.jv250.jdbc.AccountDB;
import java.nio.file.attribute.AclEntry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.varxyz.jv250.jdbc.banking.Account;
import com.varxyz.jv250.jdbc.banking.CheckingAccount;
import com.varxyz.jv250.jdbc.banking.Customer;
import com.varxyz.jv250.jdbc.banking.SavingsAccount;


public class AccountDao {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
	private static final String JDBC_USER = "jv250";
	private static final String JDBC_PASSWORED = "jv250";
	
	public AccountDao() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("LOADED DRIVER ---> " + JDBC_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 신규 고객 등록
	 * @param customer			등록할 고객정보
	 */
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account (accountNum, balance, interestRate, overdraft, accountType, customerId)"
				 + " VALUES (?, ?, ?, ?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORED);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, account.getAccountNum());
				pstmt.setDouble(2, account.getBalance());
				if (account instanceof SavingsAccount) {
					SavingsAccount sa = (SavingsAccount)account;
					pstmt.setDouble(3, sa.getInterestRate());
					pstmt.setDouble(4, 0.0);
					pstmt.setString(5, String.valueOf('S'));
				}else {
					CheckingAccount ca = (CheckingAccount)account;
					pstmt.setDouble(3, 0.0);
					pstmt.setDouble(4, ca.getOverdraftAmount());
					pstmt.setString(5, String.valueOf('C'));
				}
				pstmt.setLong(6, account.getCustomer().getCid());
				pstmt.executeUpdate();
			} finally {
				pstmt.close();
				con.close();
			}
			System.out.println("NEW ACCOUNT INSERTED...\n");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 전달된 주민번호를 가진 특정 고객의 계좌 목록 조회
	 * @param ssn		주민번호
	 * @return
	 */
	public List<Account> findAccountsBySsn(String ssn) {
		String sql = "SELECT a.aid, a.accountNum, a.balance, a.interestRate, "
				+ " a.overdraft, a.accountType, c.name, c.ssn, c.phone, a.regDate" //약칭 AS accountAid
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid"
				+ " WHERE c.ssn = ?";
		List<Account> list = new ArrayList<Account>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORED);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				Account account = null;
				while(rs.next()) {
					if ( rs.getString("accountType").charAt(0) == 'S' ) {
						account = new SavingsAccount(sql, 0);
						((SavingsAccount)account).setInterestRate(
								rs.getDouble("interestRate"));
					}else {
						account = new CheckingAccount();
						((CheckingAccount)account).setOverdraftAmount(
								rs.getDouble("overdraft"));
					}
					account.setAid(rs.getLong("aid"));
					account.setAccountNum(rs.getString("accountNum"));
					account.setBalance(rs.getDouble("balance"));
					account.setCustomer(new Customer(rs.getString("name"),
							rs.getString("ssn"), rs.getString("phone")));
					account.setRegDate(rs.getTimestamp("regDate"));
					account.setAccountType(rs.getString("accountType").charAt(0));
					list.add(account);
				}
			} finally {
				rs.close();
				pstmt.close();
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 등록된 모든 계좌 목록 조회
	 * @return
	 */
	public List<Customer> findAllAccounts() {
		String sql = "SELECT * FROM Account";
		List<Account> accountList = new ArrayList<Account>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORED);
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Account c = new Account(sql, 0);
					accountList.add(c);
				}
			} finally {
				rs.close();
				pstmt.close();
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

