package com.varxyz.banking.domain;

import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl {
	private List<Account> accountList = new ArrayList<Account>();
	private CustomerService customerService;
	
	public AccountServiceImpl() {
		customerService = new CustomerServiceImpl();
	}
	
	public Account createSavingsAccount(String accountNum, double balance, double interestRate) {		
		return new SavingsAccount(accountNum, balance, interestRate);
	}
	
	public Account createCheckingAccount(String accountNum, double balance, double overdraftAmount) {
		return new CheckingAccount(accountNum, balance, overdraftAmount);
	}
	
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	public void addAccount(Account account, String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn);
		account.setCustomer(customer);
	}
	
	public List<Account> getAccountBySsn(String ssn) {
		//주민번호에 해당하는 계좌가 나오게 구현해야하는 영역
		return null;
	}
	
	public Account getAccountByAccountNum(String accountNum) {
		
		return null;
	}
}
