package test;

public class Employee extends Person {
	
	double salary;
	String department;
	String username;
	String password;
	
	public Employee(int id, String name, String surname, int age, String phone,
			String address,double salary,String department,String username,String password) {
		super(id, name, surname, age, phone, address);
		this.department=department;
		this.username=username;
		this.password=password;
	}
	
	public void printEmployeeInfo(){
		printInfo();
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+department);
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
	}

	
}
