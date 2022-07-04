package com.varxyz.banking.domain;
/**
 * "8"+"0"
 * @author Administrator
 *
 */
public class Account {
	public static void main(String[] args) {
	}
	
	protected String accountNum;
	protected double balance;
	protected Customer customer;
	//interestRate, overDraft
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void deposite(double amount) {
		this.balance += amount;
	}

	public Account(String accountNum, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
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
}
