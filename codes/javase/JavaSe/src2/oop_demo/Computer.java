package oop_demo;

public class Computer implements Cloneable {

	public String model;
	public int year;

	public Computer(String model, int year) {
		this.model = model;
		this.year = year;
	}

	@Override
	public String toString() {
		return model + " " + year;
	}

	@Override
	public boolean equals(Object obj) {

		Computer that = null;

		if (obj instanceof Computer) {
			that = (Computer) obj;
		} else {

			return false;
		}

		if (this.model.equals(that.model) && this.year == that.year) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("1 deq gozle...");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
