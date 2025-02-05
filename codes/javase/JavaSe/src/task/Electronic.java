package task;

public class Electronic extends Product{

	public Electronic(String name, double price) {
		super(name, price);
	}
	
	@Override
	public double calculateDiscount() {
		price=price-0.8;
		return price;
	}

}
