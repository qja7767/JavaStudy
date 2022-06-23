package com.varxyz.jv250.jdbc.banking;

public class InsufficientBalanceException extends RuntimeException {
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
