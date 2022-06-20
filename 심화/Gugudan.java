package com.varyxyz.jv200.mod003;

public class gugudan {
	public static void main(String[] args) {
		for ( int i = 1; i < 10; i++ ) {
			System.out.println("");
			for ( int j = 2; j < 10; j++ ) {
				System.out.print(" ");
				System.out.print( j + "X" + i + "=" + i*j);
			}
		}
		System.out.println(" 구구단 끝");
	}
}