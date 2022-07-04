package com.varxyz.jv251.dao;

import com.varxyz.jv251.domain.Account;

public class AccountDao2 {
	public void addAccount(Account account) {
		String sql = "INSERT INTO Account (accountNum, balance, interestRate, overdraft, accountType, customerId)"
					+ " VALUES( ?, ?, ?, ?, ?, ?)";
	
	}
}
