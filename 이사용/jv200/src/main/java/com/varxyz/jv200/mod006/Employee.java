package com.varxyz.jv200.mod006;

import java.util.Date;
import java.util.Objects;

public class Employee {
	String name;
	protected double salary;
	public MyDate birthDate;
	
	public String getDetails() {
		return "Name: " + name + "\nSalary: " + salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public MyDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	public boolean equals( Object obj ) {	// boolean은 return true or false 값이 필요함
		if( obj instanceof Employee ) {	// instanceOf는 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용하는 연산자
			Employee e = (Employee) obj;	// () : 캐스팅 or 형변환
			if( e.getName().equals(name) && e.getBirthDate().equals(birthDate)) {
				return true;
			}
		}
		return false;
	}
}
