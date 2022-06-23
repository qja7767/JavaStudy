package com.varxyz.jv250.banking;

import java.util.Date;
import java.util.List;

import com.varxyz.jv250.jdbc.AccountDB.AccountDao;
import com.varxyz.jv250.jdbc.banking.Account;
import com.varxyz.jv250.jdbc.banking.Customer;
import com.varxyz.jv250.jdbc.banking.SavingsAccount;

public class AccountDaoTest {
	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		
		SavingsAccount sa = new SavingsAccount();
		sa.setAccountNum("567-89-0123");
		sa.setBalance(45000.0);
		sa.setCustomer(new Customer(1002));
		sa.setInterestRate(0.04);
		sa.setRegDate(new Date());
		sa.setAccountType('S');

		dao.addAccount(sa);
		for(Account account : dao.findAccountsBySsn("921213-1234567")) {
			System.out.println(account);
		}			
	}
}
