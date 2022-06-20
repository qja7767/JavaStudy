package com.varxyz.jv200.mod11;

import java.util.ArrayList;
import java.util.List;

public class ListGeneric {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Test");
		list.add("Test1");		
		for ( int i = 0; i < 10; i ++ ) {
			list.add("Test" + i);
		}
		System.out.println(list);
		
		List<Double> list2 = new ArrayList<Double>();
		list2.add(1.2);
		list2.add(5.4);
		for ( int i = 0; i < 10; i ++ ) {
			list2.add((double)(i/2));
		}
		System.out.println(list2);
		
		for(String s : list) {
			System.out.println(s);			
		}
//		for( int i = 0; i<list2.size(); i++ ) { <- 예전 방식
//			Object o = list2.get(i);
//			System.out.println(o);
//		}
		for(Double s1 : list2) {
			System.out.println(s1);
		}
		
	}
	
}
