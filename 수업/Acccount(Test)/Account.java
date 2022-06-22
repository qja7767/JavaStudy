package com.varxyz.banking.mod001;

/**
 * 계좌정보를 캡슐화
 */

public abstract class Account {

    protected double balance;

    public Account(double initBalance) {
    	balance = initBalance;
    }

    public double getBalance() {
           return balance;
    }

    public abstract void withdraw(double amount) throws Exception;
	}

	public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(double initBalance, double interestRate) {
           super(initBalance);
           this.interestRate = interestRate;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{

           if(balance - amount < 0){
                   throw new InsufficientBalanceException("에러: 잔고부족", balance);
           }else{
                   balance -= amount;
           }
    }
	}

	public class CheckingAccount extends Account {
		private double overdraftAmount;

		public CheckingAccount(double initBalance, double overdraftAmount) {
			super(initBalance);
			this.overdraftAmount = overdraftAmount;
		}

		@Override
		public void withdraw(double amount) throws OverdraftException{
			if (balance < amount ) {
				double overdraftNeeded = amount - balance;
				if ( overdraftAmount < overdraftNeeded ) {
             throw new OverdraftException("에러: 대월금 초과", balance, overdraftAmount );
				} else {
					balance = 0.0;
					overdraftAmount -= overdraftNeeded;
					//System.out.println("출금(Overdraft):"+amount);
				}
				
				} else {
					balance = balance - amount;
					//System.out.println("출금(C):"+amount);
				}
		}
	}

public class InsufficientBalanceException extends Exception {

    private double balance;
    public InsufficientBalanceException(String msg, double balance){
           super(msg);
           this.balance = balance;
    }

    @Override
    public String getMessage(){
           return "현재 잔고는 "+balance+"원 입니다.";
    }
}

public class OverdraftException extends Exception {
    private double overdraftAvail;
    public OverdraftException(String msg, double overdraftAvail){
           super(msg);
           this.overdraftAvail = overdraftAvail;
    }

    @Override
    public String getMessage(){
           return "사용 가능한 대월액은 "+overdraftAvail+"원 입니다.";
    }

}

// 문제
//Account
//
//<<constructors>>
//+Account (initBalance: double)
//
//<<method>>
//+getBalance(): double
//+deposit(amt:double): void
//+withdraw(amt:double):void