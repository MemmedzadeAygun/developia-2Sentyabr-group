package main;

public class MainClass2 {
	public static void main(String[] args) {
		Extra e1 = new Extra();

		int[] array = { 12, 45, 68, 8, 9 };
//	e1.giveArrayElement(array, 8);

		try {
			System.out.println(e1.giveArrayElement(array, 0));
		} catch (BizmkilerException e) {
			System.out.println(e.getBizimMesaj());
		} finally {
			System.out.println("bu blok mutleq ise dusmelidir");

		}
	}
}