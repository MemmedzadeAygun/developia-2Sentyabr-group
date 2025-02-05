package task;

public class Clothing extends Product {

	public Clothing(String name, double price) {
		super(name, price);
	}

	@Override
	public double calculateDiscount() {
		price=price*0.85;
		return price;
	}
	
}
