package oopPractice;

public class Dog implements Animal {

	@Override
	public void smell() {
		System.out.println("The dog sniffs");

	}

	@Override
	public void makeSound() {
		Animal.super.makeSound();
		System.out.println("The dog make sound");
	}

}
