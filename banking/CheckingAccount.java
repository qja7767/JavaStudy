package com.varxyz.jv250.jdbc.banking;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public void withdraw(double amount) {
		
		if(balance < amount ) {
			throw new InsufficientBalanceException("한도 초과");
		}else {
			balance = balance - amount;
		}
	}

	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}
	
}


