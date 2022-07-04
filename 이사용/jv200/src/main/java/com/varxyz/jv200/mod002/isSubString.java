package com.varxyz.jv200.mod002;

import java.util.Iterator;

public class isSubString {
	public static boolean isSubString(String item, String line) {
		boolean num = false;
		int count = 0;
		for (int i = 0; i < item.length(); i++) {
			for (int j = 0; j < line.length(); j++) {
				if(item.charAt(i) == line.charAt(j)) {
					count++;
					if ( count == item.length()) {
						num = true;
						break;
					} else {
						num = false;
						break;
					}
				}
			}
		}
		return num;
	}
}
