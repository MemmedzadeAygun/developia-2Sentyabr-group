package oopPractice;

public class MainClassOop2 {
	public static void main(String[] args) {

		Cat cat = new Cat();
//		Animal cat=new Cat();
		cat.smell();
		cat.makeSound();

		Dog dog = new Dog();
		dog.smell();
		dog.makeSound();
	}
}
