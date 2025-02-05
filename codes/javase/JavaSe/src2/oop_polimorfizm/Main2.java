package oop_polimorfizm;

abstract class Animal{
	
	public abstract void speak();
	
	public void makeSound() {
		System.out.println("Animal make sound...");
	}
}

class Cat extends Animal{
	public String name;
	public int age;

	@Override
	public void speak() {
		System.out.println("Cat speak..");
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cat[name="+name+" ,"+"age="+age+"]";
	}
	
}

public class Main2 {
	public static void main(String[] args) {
		
		Animal a1=new Cat();
		a1.speak();
		
		Cat cat=new Cat();
		System.out.println(cat.toString());
	}
}
