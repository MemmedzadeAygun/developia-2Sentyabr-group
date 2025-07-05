package oop;

public class MainClass2 {
	public static void main(String[] args) {

		Computers dell = new Computers("Inspiro", 12);
		Computers acer = new Computers("Inspiro", 12);

		String s = "pisik";

		System.out.println(dell.equals(acer));
	}
}
