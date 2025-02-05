package polimorfizm;

class Animal{
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public void makeSound() {
		System.out.println("Animal sound...");
	}
}

class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Cat sound...");
	}
	
}

class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	
	@Override
	public void makeSound() {
		System.out.println("Dog sound...");
	}
}

public class MainClass {
	
	public static void speak(Animal animal) {
		animal.makeSound();
	}
	
	
//	public static void speak(Cat cat) {
//		cat.makeSound();
//	}
//	public static void speak(Dog dog) {
//		dog.makeSound();
//	}
	
	public static void main(String[] args) {

		speak(new Cat("Tom"));
		speak(new Dog("Tomy"));
		
		
		Animal animal=new Animal("Horse");
		animal.makeSound();
		
		
		/*Cat cat=new Cat("Tom");
		cat.makeSound();
		
		Dog dog=new Dog("Tomy");
		dog.makeSound();*/
		
		
		Animal cat=new Cat("Tom");
		cat.makeSound();
		
		Animal dog=new Dog("Tomy");
		dog.makeSound();
		
		
	}
}
