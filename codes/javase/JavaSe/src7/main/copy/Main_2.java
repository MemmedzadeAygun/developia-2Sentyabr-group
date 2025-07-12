package main.copy;

public class Main_2 {
	public static void main(String[] args) {
		
		int a = 12;
		int result = 0;
		try {
			
			result = a / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(result);
	}
}
