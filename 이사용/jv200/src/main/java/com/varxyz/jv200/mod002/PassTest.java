package com.varxyz.jv200.mod002;

public class PassTest {
   public static void changeInt(int value) {
      value = 55;
   }
   
   public static void changeObjectRef(MyDate ref) {
      ref = new MyDate(1, 1, 2000);
   }
   
   public static void changeObjectAttr(MyDate ref) {
      ref.setDay(4);
   }
   
   public static void main (String [] args) {
      MyDate date;
      int val;
      val = 11;
      changeInt(val);
      System.out.println("int value is " + val);
      
      date = new MyDate(22, 7, 1964);
      changeObjectRef(date);
      System.out.println("MyDate is " + date);
   
      changeObjectAttr(date);
      System.out.println("MyDate is " + date);
   }
}