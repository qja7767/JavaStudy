package com.varxyz.jv200.mod007;

public class Dog extends Animal {
	
	@Override
	public void makeSound() {
		System.out.println("멍멍");		
	}
	
	@Override
	public void Eat() {
		System.out.println("냠");
	}
	
	@Override
	public void fight() {
		System.out.println("깨물어서 싸운다");
	}
	
	@Override
	public void Favorite() {
		System.out.println("생닭");
	}
	
}


