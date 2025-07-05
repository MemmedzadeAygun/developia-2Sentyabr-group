package main;

public class MainClass {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };

		int a = 0;
		try {
			a = arr[6];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(a);

		System.out.println("_-----------------------");

		int b = 12;
		int result = 0;
		try {
			result = b / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(result);
	}
}
