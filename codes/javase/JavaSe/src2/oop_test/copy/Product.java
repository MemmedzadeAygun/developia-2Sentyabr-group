package oop_test.copy;

public class Product {
	private String name;
	private int price;
	private int quantity;
	
	
	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		
		return "Product["+" "+"name: "+" "+name+" "+"price: "+price+" "+"quantity: "+quantity+"]";
	}
}
