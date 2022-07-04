package com.varxyz.jv200.mod006;

public class Manager extends Employee {
	protected String department;

//	method overriding
	public String getDetails() {
		return super.getDetails() + "\nDepartment: " + department;
	}
}
