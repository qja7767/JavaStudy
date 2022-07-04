package com.varxyz.jv200.mod007;

public class FlyerTest {
	public static void main(String[] args) {
		Flyer f = new Airplane();
		f.fly();
		f.takeOff();
		f.land();
		Bird b = new Bird();
		b.fly();
		b.takeOff();
		b.land();
		Flyer c = new Bird();
		c.fly();
		
	}
}
