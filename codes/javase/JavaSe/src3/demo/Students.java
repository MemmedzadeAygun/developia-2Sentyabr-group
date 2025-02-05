package demo;

public class Students {

	private String name;
	private int age;
	
	
	public Students(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + "]";
	}
	
	
}
