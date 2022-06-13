package com.varyxyz.jv200.mod003;

public class ArrayStudy {
	public static void main(String[] args) {
		
		//메인 비교 대상
		int[] num1 = new int[] { 1, 2, 3, 4, 5, 6 };
		
		//일부 포함되는 경우
		int[] num2 = new int[] { 6, 7 };
		
		//전체 포함되는 경우
		int[] num3 = new int[] { 3, 4 };
		
		//포함 안되는 경우
		int[] num4 = new int[] { 7, 8 };			
		
		int count = 0;
		
		for(int i = 0; i < num1.length ; i++) {
			for(int j = 0; j< num2.length; j++) {
				if(num1[i] == num2[j]) {
					count += 1;
				}
			}
		}
		
		//검사하는곳
		if ( count == num1.length ) {
			System.out.println("일치");
		}else if( 0 < count && count < num1.length ) {
			System.out.println("포함");
		}else {
			System.out.println("포함X");
		}					
	}

}
