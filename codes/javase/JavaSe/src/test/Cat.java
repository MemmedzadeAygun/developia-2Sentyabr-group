package test;

public class Cat extends Animal {

	public Cat(String name, int id) {
		super(name);
		this.id = id;
	}

	int id;

	public void showCatInfo() {
		System.out.println("Cat info..");
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
	}

}
