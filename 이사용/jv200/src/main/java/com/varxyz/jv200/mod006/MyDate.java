package com.varxyz.jv200.mod006;

import java.util.Objects;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public boolean equals( Object obj ) {	// boolean은 return true or false 값이 필요함
		if( obj instanceof MyDate ) {	// instanceOf는 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용하는 연산자
			MyDate d = (MyDate) obj;	// () : 캐스팅 or 형변환
			if( d.day == day && d.month == month && d.year == year ) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		MyDate d1 = new MyDate(1, 1, 2000);
		MyDate d2 = new MyDate(2, 1, 2000);
		
		boolean flag = d1.equals(d2);
		System.out.println(flag);
	}

}
