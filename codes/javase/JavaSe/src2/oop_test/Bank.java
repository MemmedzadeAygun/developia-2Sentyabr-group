package oop_test;

public class Bank {

	String name;
	String filial;

	public Bank(String name, String filial) {
		super();
		this.name = name;
		this.filial = filial;
	}

	/*
	 * @Override public String toString() { return "Bank name: "+
	 * name+" "+"Filial name: "+" "+filial; }
	 */

	@Override
	public boolean equals(Object obj) {
		Bank that = null;
		if (obj instanceof Bank) {
			that = (Bank) obj;
		} else {
			return false;
		}

		if (this.name.equals(that.name) && this.filial.equals(that.filial)) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Gozle 1 deq...");
	}
}
