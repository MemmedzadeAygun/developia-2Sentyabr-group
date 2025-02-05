package oop2;

import oopPractice.MathOperations;

public class Calculator {

	public void opration() {
		int sum=MathOperations.add(3, 5);
		
		int product=MathOperations.multiply(12, 3);
		
		System.out.println("Sum: "+sum);
		System.out.println("Product: "+product);
	}
}
