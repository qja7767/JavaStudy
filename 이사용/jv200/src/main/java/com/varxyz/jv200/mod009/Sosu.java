package com.varxyz.jv200.mod009;
//1부터 1000까지 소수의 수

public class Sosu {
	public static void main(String[] args) {
		
		int count;
		count = 0;
		
		for ( int i = 2; i < 1000; i++) {
			for (int j = 2; j <=i; j++ ) {
				if (i == j) {
					++count;
				}else if ( i % j == 0) {
					break;
				}
			}
		}
		System.out.println(count);
	}
}

//i%j

//2%1
//2%2 = count

//3%1
//3%2
//3%3 = count

//4%1
//4%2 = break
//4%3
//4%4 = no count

//5%1
//5%2
//5%3
//5%4
//5%5 = count

//6%1
//6%2
//6%3 = break
//6%4
//6%5
//6%6 = no count
