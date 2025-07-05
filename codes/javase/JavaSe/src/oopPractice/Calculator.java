package oopPractice;

public class Calculator {

	public void operations() {
		int sum = MathOperations.add(4, 6);
		int product = MathOperations.multiply(12, 3);

		System.out.println("Sum: " + sum);
		System.out.println("Product: " + product);
	}
}
