package main;

public class Teacher implements Animals {
	private String name;

	@Override
	public void eat() {
		System.out.println("It yemek yeyir");
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
