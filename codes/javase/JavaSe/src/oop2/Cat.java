package oop2;

public class Cat implements Animal{

	@Override
	public void smell() {
		System.out.println("Cat smell");
		
	}
	
	@Override
	public void makeSound() {
		System.out.println("Cat make sound");
	}

}
