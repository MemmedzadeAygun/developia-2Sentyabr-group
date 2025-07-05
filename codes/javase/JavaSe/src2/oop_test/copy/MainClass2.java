package oop_test.copy;

import oop_demo.Computer;

public class MainClass2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Computer c1 = new Computer("Inspiro", 12);

		Computer cloneComp = (Computer) c1.clone();
		c1.model = "nitro5";
		System.out.println(cloneComp);
	}
}
