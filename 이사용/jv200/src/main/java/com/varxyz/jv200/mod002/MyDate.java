package com.varxyz.jv200.mod002;

public class MyDate {
	private int day;	// 변수 선언
	private int month;	// 변수 선언
	private int year;	// 변수 선언
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
   
	public MyDate(MyDate date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}

	public void setDay(int day) {
		this.day = day;
   }
   
   public String toString() {
      return "day = " + day + ", month = " + month + ", year = " + year;
   }
}
