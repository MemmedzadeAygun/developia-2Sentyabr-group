package oop;

public class Computers {

	String name;
	int age;

	public Computers(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {

		Computers that = null;
		if (obj instanceof Computers) {
			that = (Computers) obj;
		} else {
			return false;
		}

		if (this.name.equals(that.name) && this.age == that.age) {
			return true;
		} else {
			return false;
		}

//		this.name.equals(obj.name);

	}
}
