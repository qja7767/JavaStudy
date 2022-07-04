package com.varxyz.jv200.mod11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		list.add("second");	//duplicate, is added
		list.add(new Integer(4)); // duplicate, is added
		List list1 = new ArrayList();
		list1.add("test");
		list1.add("test1");
		list1.add("test2");
		list1.add(1);
		list1.add(0.1);
//		list1.add(★);		
		for (int i = 0; i < 10; i ++) {
			list1.add(i*6);
		}		
		
		System.out.println(list);
		System.out.println(list1);		
	}
}
