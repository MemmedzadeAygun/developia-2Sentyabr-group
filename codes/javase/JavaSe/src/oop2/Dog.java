package oop2;

public class Dog implements Animal{

	@Override
	public void smell() {
	System.out.println("Dog smell");	
	}
	
	@Override
	public void makeSound() {
		System.out.println("Dog make sound");
	}

}
