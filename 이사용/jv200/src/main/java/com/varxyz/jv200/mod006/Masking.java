package com.varxyz.jv200.mod006;
	public class Masking {
		public static String masking(String phone_number) {
			char[] ch = phone_number.toCharArray();
			for( int i = 0; i < ch.length - 4; i ++ ) {
				ch[i] = '*';
			}
			return String.valueOf(ch);
		}
		
		public static void main(String[] args) {
			System.out.println(masking("01012347667"));
		}
	}
