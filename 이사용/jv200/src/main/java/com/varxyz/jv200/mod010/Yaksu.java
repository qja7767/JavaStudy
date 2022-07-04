package com.varxyz.jv200.mod010;

public class Yaksu {
	public static void main(String[] args) {
		int num = 60;
		int count = 0;
		int[] yaksuArray = new int[100];
		
		for ( int i = 1; i <= num; i++) {
			if ( num % i == 0 ) {
//				System.out.println(i+" ");
				yaksuArray[i] = i;
				
				System.out.print(" " + yaksuArray[i]);				
				count ++;
			}
		}
		
	}
}
