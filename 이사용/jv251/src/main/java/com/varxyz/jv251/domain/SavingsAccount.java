package com.varxyz.jv251.domain;
import com.varxyz.jv251.exception.InsufficientBalanceException;

public class SavingsAccount extends Account {
	private static final double DEFAULT_INTEREST_RATE = 0.03;
	private double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public static double getDefaultInterestRate() {
		return DEFAULT_INTEREST_RATE;
	}
	public SavingsAccount() {
		
	}
	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance, 0.0); //DEFAULT_INTEREST_RATE
	}	
	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount) {
		if(balance - amount < 0 ) {
			throw new InsufficientBalanceException("잔고 부족");
		}
		super.balance -= amount;
	}
}
