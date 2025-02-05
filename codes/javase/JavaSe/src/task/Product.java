package task;

public class Product {

	String name;
	double price;
	

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public double calculateDiscount() {
		price=price*0.9;
		return price;
	}
	
}
