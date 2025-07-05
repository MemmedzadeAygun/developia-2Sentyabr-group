package oop2;

public interface Animal {

	default void makeSound() {
		System.out.println("Animal sound..");
	}

	void smell();
}
