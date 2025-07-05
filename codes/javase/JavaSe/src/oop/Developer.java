package oop;

public class Developer extends Person {

	String department;
	double salary;
	private Computer computer;

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public Developer(String name, String surname, String deparment, double salary) {
		super(name, surname);
		this.department = deparment;
		this.salary = salary;
	}

	public void sound() {
		System.out.println();
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Deparment: " + department);
		System.out.println("Salary: " + salary);
	}
}
