package oop;

public class Car implements IProduct {

	@Override
	public void delete() {
		System.out.println("Car delete successfully");
		
	}

	@Override
	public void get() {
		System.out.println("Car get successfully");
		
	}

	@Override
	public void update() {
		System.out.println("Car update successfully");
		
	}

	@Override
	public void add() {
		System.out.println("Car added successfully");
		
	}

}
