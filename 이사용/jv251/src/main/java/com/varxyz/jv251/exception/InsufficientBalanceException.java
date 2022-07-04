package com.varxyz.jv251.exception;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends RuntimeException {
	private double balance;
	
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
	
	public InsufficientBalanceException(String msg, double balance) {
		super(msg);
		this.balance = balance;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + " 현재 잔고는 " + balance + " 입니다. ";
	}
}
