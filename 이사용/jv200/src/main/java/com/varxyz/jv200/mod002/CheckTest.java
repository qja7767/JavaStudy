package com.varxyz.jv200.mod002;

public class CheckTest {
	   
	   public static void main(String[] args) {      
	      int[] a = {1, 2, 3, 4};
	      int[] b = {3, 4, 5};
	      
	      Check array = new Check(a, b);
	      array.checkArray();
	   }
	}