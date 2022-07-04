package com.varxyz.jv251.exception;

@SuppressWarnings("serial")
public class OverdraftException extends InsufficientBalanceException {
	private double overdraftAvail;
	
	public OverdraftException(String msg, double balance, double overdraftAvail) {
		super(msg, balance);
		this.overdraftAvail = overdraftAvail;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage() + ", 사용 가능한 대월액은" + overdraftAvail + " 입니다. ";
	}
}
