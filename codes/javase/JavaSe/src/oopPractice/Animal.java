package oopPractice;

public interface Animal {

	default void makeSound() {
		System.out.println("Animal sound...");
	}
	
	void smell();
}
