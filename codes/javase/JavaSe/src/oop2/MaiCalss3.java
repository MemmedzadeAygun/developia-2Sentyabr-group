package oop2;

class Animal2 {
	private String name;

	public Animal2(String name) {
		this.name = name;
	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public void makeSound() {
		System.out.println("Heyvan sesi...");
	}
}

class Cat2 extends Animal2 {

	public Cat2(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("Pisik sesi...");
	}
}

class Dog2 extends Animal2 {

	public Dog2(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println("It hurur...");
	}

}

public class MaiCalss3 {

	/*
	 * public static void speak(Cat2 cat) { cat.makeSound(); }
	 * 
	 * public static void speak2(Dog2 dog) { dog.makeSound(); }
	 */

	public static void speak(Animal2 animal) {
		animal.makeSound();
	}

	public static void main(String[] args) {

		speak(new Cat2("Tom"));
		speak(new Dog2("Toppus"));

		Animal2 animal = new Animal2("Animal");
		animal.makeSound();

		/*
		 * Cat2 cat=new Cat2("Tom"); cat.makeSound();
		 * 
		 * Dog2 dog=new Dog2("Toppus"); dog.makeSound();
		 */

		/*
		 * Animal2 animal2 = new Cat2("Tom"); animal2.makeSound();
		 * 
		 * Animal2 animal3 = new Dog2("Toppus"); animal3.makeSound();
		 */
	}
}
