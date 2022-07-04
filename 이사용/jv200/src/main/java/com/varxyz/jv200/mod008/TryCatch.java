package com.varxyz.jv200.mod008;

public class TryCatch {
	/**
	 * try = 예외 가능성이 있는 코드
	 * catch = 예외 발생시 처리할 코드
	 * finally = 예외 발생유무와 관계없이 처리할 코드
	 * 런타임 계열은 굳이 잡지 않아도됨. 비런타임 계열은 잡아야함.
	 * 
	 */
	public static void main(String[] args) {
		try {
			int sum = 0;
			for ( String arg : args ) {
				sum += Integer.parseInt (arg);
			}
			System.out.println("Sum = " + sum);
		} catch ( NumberFormatException nfe ) {
			System.err.println("One of the command-line"
			+ "arguments is not an integer");
		}
						
	}
	
	/**
	 * 
	 * @throws AException
	 * @throws BException
	 */	
//	public void doSomething() throws AException, BException {
//		
//	}
}
