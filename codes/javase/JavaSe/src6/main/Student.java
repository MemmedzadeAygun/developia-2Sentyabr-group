package main;

public class Student {

	Integer id;
	String name;
	String surname;
	Integer age;
	
//	public Student() {
//		System.out.println("Obyekt yarandi");
//	}
	
	public Student(String _name,String _surname,Integer _age) {
		this.name = _name;
		this.surname = _surname;
		this.age = _age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}

}
