package test;

public class Animal {
	
	String name;
	

	public Animal(String name) {
		this.name = name;
	}

	public void showAnimalInfo() {
		System.out.println("Animal info..");
		System.out.println("Animal name: "+name);
	}
}
