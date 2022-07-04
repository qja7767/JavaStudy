package com.varxyz.jv200.mod007;

public class Cat extends Animal{

	@Override
	public void makeSound() {
		System.out.println("야옹");		
	}
	
	@Override
	public void Eat() {
		System.out.println("냠(고양이)");
	}
	
	@Override
	public void fight() {
		System.out.println("발톱으로 싸운다");
	}
	
	@Override
	public void Favorite() {
		System.out.println("생선");
	}
	
}
