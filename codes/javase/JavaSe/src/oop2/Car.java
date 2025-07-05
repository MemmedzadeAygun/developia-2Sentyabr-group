package oop2;

public class Car implements Product, Helper {

	@Override
	public void add() {
		System.out.println("Car added");

	}

	@Override
	public void delete() {
		System.out.println("Car deleted successfully..");

	}

	@Override
	public void update() {
		System.out.println("Car update successfully");

	}

	@Override
	public void get() {
		System.out.println("Car get successfully...");

	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub

	}

}
