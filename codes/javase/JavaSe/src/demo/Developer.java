package demo;

public class Developer extends Person2 {
	
	String department;
	double salary;
	private Pen pen;
	
	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public Developer(String name, String surname,String department, double salary) {
		super(name, surname);
		this.department=department;
		this.salary=salary;
		
	}
	
	@Override
	public void printInfo() {
//		System.out.println("Name: "+name);
//		System.out.println("Surname: "+surname);
		super.printInfo();
		System.out.println("Department: "+department);
		System.out.println("Salary: "+salary);
	}
}
