package oop;

public interface IProduct {

	void add();
	void delete();
	void get();
	void update();
	
	default void sleep() {
		System.out.println("Product class");
	}
}
