package oop;

public class Electronic implements IProduct {

	@Override
	public void delete() {
		System.out.println("Electronic delete successfully");
		
	}

	@Override
	public void get() {
		System.out.println("Electronic get successfully");
		
	}

	@Override
	public void update() {
		System.out.println("Electronic update successfully");
		
	}

	@Override
	public void add() {
		System.out.println("Electronic added successfully");
		
	}


}
