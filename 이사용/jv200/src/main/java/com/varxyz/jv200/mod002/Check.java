package com.varxyz.jv200.mod002;

public class Check {
	   int[] a;
	   int[] b;
	   int count = 0 ;
	   
	   public Check(int[] x, int[] y) {
	      this.a = x;
	      this.b = y;
	   }
	   
	   public void checkArray() {
	      for (int i = 0; i < a.length; i++) {
	         for (int j = 0; j < b.length; j++) {
	            if ( a[i] == b[j] ) {
	               count ++;
	            }
	         }
	      }
	      if ( count == b.length ) {
	         System.out.println("b 배열은 a 배열 안에 포함되어 있다.");
	      }
	      else if( count == 0) {
	         System.out.println("b 배열은 a 배열에 포함되어있지 않다.");
	      }
	      else {
	         System.out.println("b 배열의 일부는 a 배열 안에 포함되어 있다.");
	      }
	      
	   }

	}