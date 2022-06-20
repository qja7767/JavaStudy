package com.varxyz.jv200.mod11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(1), "유비");
		map.put(2, "관우"); // auto
		map.put(new Integer(3), "장비"); // 과거에 썼으나 버젼에 따라 valueOf를 사용하는것을 권고(자바)
				
		System.out.println(map.get(new Integer(1)));
		System.out.println(map.get(Integer.valueOf(2)));
		System.out.println(map.get(3));
		
		Set<Integer> set = map.keySet();
		for(Integer integer : set) {
			System.out.print(integer);
			System.out.println(" = " + map.get(integer));
		}
	}
}
