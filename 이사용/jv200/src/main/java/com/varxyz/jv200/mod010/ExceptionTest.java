package com.varxyz.jv200.mod010;
import java.util.Scanner;

public class ExceptionTest {
	public static int sosu(int a) throws SosuException {

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		for ( int i = a; i < 1000; i++) {
			for (int j = 2; j <=i; j++ ) {
				if (i == j) {
					throw new SosuException(a + "는 소수입니다.");
				}else if ( i % j == 0) {
					if ( true ) {
						throw new SosuException(a + " = " + (i/j) + " X " + (j) + "는 소수가 아닙니다.");
					}
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		
		System.out.println("숫자를 입력하세요(소수 검사)");
		try {
			System.out.println(sosu(0));
		} catch ( SosuException e) {
			System.err.println(e.getMessage());
		}
	}
	
}
