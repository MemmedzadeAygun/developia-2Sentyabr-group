package oop;

class Animal extends Object{
	private String name;

	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	Animal getInfo() {
		System.out.println("Animal Name: "+name);
		return this;
	}
	
	public void makeSound() {
		System.out.println("Animal make sound..");
	}
	
	@Override
	public String toString() {
		return name;
	}
}

class Cat extends Animal{
	private int age;

	public Cat(String name,int age) {
		super(name);
		this.age=age;
	}
	
	@Override
	Cat getInfo() {
		System.out.println("Cat Name: "+getName());
		System.out.println("Age: "+age);
		return this;
	}
	
	@Override
	public void makeSound() {
		System.out.println("Cat make sound...");
		
	}
	
	@Override
	public String toString() {
		return getName()+" "+age;
	}
	
}

public class MainClass {
	public static void main(String[] args) {
		
		Animal animal=new Animal("Horse");
		System.out.println(animal.toString());
		
		Cat cat=new Cat("Tom",3);
		System.out.println(cat.toString());
		
		long l=3000;
		int i=(int)l;
		
		/*animal.getInfo();
		animal.makeSound();
		
		Cat cat=new Cat("Tom",3);
		cat.getInfo();
		cat.makeSound();*/
	}
}
