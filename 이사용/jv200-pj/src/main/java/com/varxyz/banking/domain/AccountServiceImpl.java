package com.varxyz.banking.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AccountServiceImpl implements AccountService{
	private static AccountService service = new AccountServiceImpl();
	private List<Account> accountList = new ArrayList<Account>();
	private CustomerService customerService;
	
	public AccountServiceImpl() {
		customerService = CustomerServiceImpl.getInstance();
	}
	
	public static AccountService getInstance() {
		return service;
	}
	
	public Account createSavingsAccount(String accountNum, double balance, double interestRate) {		
		return new SavingsAccount(accountNum, balance, interestRate);
	}
	
	public Account createCheckingAccount(String accountNum, double balance, double overdraftAmount) {
		return new CheckingAccount(accountNum, balance, overdraftAmount);
	}
	/**
	 * 계좌 정보와 고객정보 전체를 캡슐화
	 * @param account
	 */
	public void addAccount(Account account) {
		accountList.add(account);
	}
	/**
	 * 전달된 ssn을 통해 고객을 조회한 후 신규 계좌 등록.
	 */
	public void addAccount(Account account, String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn);
		account.setCustomer(customer);
	}
	
	public List<Account> getAccountBySsn(String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn);
		return customer.getAccountList();
		// customer.getAccountList()의 자료형이 List<Account>기 때문에 List<Account> 자료형으로 통일.		
	}
	
	public Account getAccountByAccountNum(String accountNum) {
		for(Account c : accountList) {
			if(accountNum.equals(c.getAccountNum())) {
				return c;
			}
		}
		return null;
	}
    //=============
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
	}

	@Override
	public Customer getCustomerBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumOfCustomers() {
		// TODO Auto-generated method stub
		return 0;
	}
}
