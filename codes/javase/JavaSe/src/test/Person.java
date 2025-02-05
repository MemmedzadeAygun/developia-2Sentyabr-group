package test;

public class Person {

	int id;
	String name;
	String surname;
	int age;
	String phone;
	String address;
	
	
	public Person(int id, String name, String surname, int age, String phone, String address) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}



	public void printInfo() {
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Surname "+surname);
		System.out.println("Age "+age);
		System.out.println("Phone "+phone);
		System.out.println("Address "+address);
	}
}
