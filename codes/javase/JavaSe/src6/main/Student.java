package main;

public class Student {

	Integer id;
	String name;
	String surname;
	public Integer age;

//	public Student() {
//		System.out.println("Obyekt yarandi");
//	}

	public Student(String _name, String _surname, Integer _age) {
		this.name = _name;
		this.surname = _surname;
		this.age = _age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + "]";
	}

	public void showInfo() {
		System.out.println(this.name);
	}

	public void showInfo(Integer number) {
		System.out.println(number);
	}

	public Integer calc(int num, String name) {
		num = 20;
		return num;

	}

	public static void calc(Student s) {
		s.age = 20;
		System.out.println(s.age);

	}

}
