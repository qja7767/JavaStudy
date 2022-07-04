package com.varxyz.jv200.mod11;

import java.util.Set;
import java.util.*;

public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		Set set1 = new HashSet();
		Set set2 = new HashSet();
		set.add("one");
		set.add("second");
		set.add("3rd");
		
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		set.add("second"); //dulicate, not added - string pool에 같이 존재
		set.add(new Integer(4));//duplicate, not added - 
		set.add("test");
		set.add(new Integer(1000));
		set.add(set);
		set1.add("one");
		set1.add("second");
		System.out.println(set);
		System.out.println(set1);
	}
}
