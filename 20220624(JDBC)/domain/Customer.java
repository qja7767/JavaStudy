package com.varxyz.jv251.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Customer {
	
	private long cid;
	private String name;
	private String ssn;
	private String phone;
	private String userId;
	private String passwd;
	private List<Account> accountList;
	
	public Customer() {
		
	}
	
	public Customer(long cid) {
		this.cid = cid;
	}
	
	public Customer(String name, String ssn, String phone) {
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
	}
	
	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

	@Override
	public String toString() {
		return cid + ", " + name + ", " + ssn + ", " + phone;
	}
	
}
	

