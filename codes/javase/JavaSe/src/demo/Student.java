package demo;

public class Student extends Person {
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private int id;

	public Student(String name, int id) {
		super(name);
		super.name = "Jhon";
		this.id = id;
	}

	@Override
	public void showName() {
		System.out.println("Id: " + id);
	}

	public void showStudentInfo() {
		super.showName();
		System.out.println("Id: " + id);

	}

	/*
	 * public void showStudentInfo() { super.showName();
	 * System.out.println(super.name); System.out.println("Id: "+this.id); }
	 */

}
