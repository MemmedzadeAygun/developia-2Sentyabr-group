package main;


public class Cat implements Animals {
	private Integer age;

	@Override
	public void eat() {
		System.out.println("Pisik yemek yeyir");
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + "]";
	}
	
	

}
