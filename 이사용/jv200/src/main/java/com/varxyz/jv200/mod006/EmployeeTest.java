package com.varxyz.jv200.mod006;

import java.util.Date;

public class EmployeeTest {

	public static void main(String[] args) {
		Director e = new Director();
		e.name = "장비";
		e.salary = 1000.0;
//		e.birthDate = new Date();
		e.department = "기획부";
		String detail = e.getDetails();
		System.out.println(e.birthDate);
		
		Manager m =new Manager();
		m.department = "영업부";
		m.name = "관우";
		m.salary = 2000.0;
		System.out.println(m.getDetails());
		}
}
