package com.varxyz.jv250.jdbc.banking;
/**
 * "8"+"0"
 * @author Administrator
 *
 */
public class Account {
	protected String accountNum;
	protected double balance;
	protected double interestRate;
	protected double overdraft;
	protected String accountType;
	protected String customerID;


	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void deposite(double amount) {
		this.balance += amount;
	}

	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
	}
	
	public Account() {

	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}	

	public double getBalance() {
		return balance;
	}

	public String getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

}
