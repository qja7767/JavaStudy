package com.varxyz.jv251.domain;
import com.varxyz.jv251.exception.InsufficientBalanceException;
import com.varxyz.jv251.exception.OverdraftException;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public double getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(double overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}

	public void withdraw(double amount) {
		if(balance < amount ) {
//			throw new InsufficientBalanceException("한도 초과");
			double overdraftNeeded = amount - balance;
			if(overdraftAmount < overdraftNeeded) {
				throw new OverdraftException("에러 : 대월금 초과", balance, overdraftNeeded);
			}else {
				balance = 0.0;
				overdraftAmount = overdraftAmount - overdraftNeeded;
			}
		}else {
			balance = balance - amount;
		}
	}
	
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(String accountNum, double balance, double overdraftAmount) {
		super(accountNum, balance);
		this.overdraftAmount = overdraftAmount;
	}
	
}


