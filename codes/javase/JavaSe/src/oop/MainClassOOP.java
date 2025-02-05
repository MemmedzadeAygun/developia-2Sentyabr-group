package oop;

public class MainClassOOP {
	public static void main(String[] args) {

		Developer d1 = new Developer("Jhon", "Wick", "IT", 3000);
//	d1.printInfo();
		d1.printInfo();

		Computer computer = new Computer();
		d1.setComputer(computer);

	}
}
