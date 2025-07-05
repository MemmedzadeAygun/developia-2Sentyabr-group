package oopPractice;

public class Cat implements Animal {

	@Override
	public void smell() {
		System.out.println("The cat sniffs");

	}

	@Override
	public void makeSound() {
		Animal.super.makeSound();
		System.out.println("The cat make sound");
	}

}
