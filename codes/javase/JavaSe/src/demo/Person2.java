package demo;

public class Person2 {

	String name;
	String surname;

	public Person2(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Surname: " + surname);
	}
}
