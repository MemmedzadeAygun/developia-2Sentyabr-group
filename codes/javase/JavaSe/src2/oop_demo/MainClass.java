package oop_demo;

public class MainClass {
	public static void main(String[] args) {

		Computer c1 = new Computer("Inspire", 12);

		Computer c2 = new Computer("Inspire", 12);

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

		System.out.println(c1.toString());

		String s = "Alma";

		System.out.println(c1.equals(s));

		c2 = null;
		System.gc();

//	String s="Alma";
//	String s2="Alma";
//	System.out.println(s.equals(s2));
	}
}
