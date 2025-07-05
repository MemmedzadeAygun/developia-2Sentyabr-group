package test;

public class MainClas {
	public static void main(String[] args) {

		int[] array = { 12, 2, 3, 44, 5 };

		try {
			System.out.println(array[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("---------------------");

		int a = 12;
		int b = 0;
		int result = 0;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(result);

		System.out.println("----------------------");

		String s = "Hello World!";
		int result2 = 0;
		try {
			result2 = s.charAt(12);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(result2);

		System.out.println("---------------------");

		String s2 = null;
		try {
			System.out.println(s2.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}
}
