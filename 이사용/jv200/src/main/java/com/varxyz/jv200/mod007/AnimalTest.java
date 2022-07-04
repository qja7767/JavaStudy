package com.varxyz.jv200.mod007;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		Animal animal3 = new Dog();
		animal1.makeSound();
		animal2.makeSound();
		animal1.makeSound();
		animal2.makeSound();
		animal1.Eat();
		animal2.Eat();
		animal3.makeSound();
		animal1.fight();
		animal2.fight();
		animal1.Favorite();
	}
}
