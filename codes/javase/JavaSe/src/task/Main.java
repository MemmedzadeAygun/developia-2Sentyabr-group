package task;

public class Main {
public static void main(String[] args) {
	
	Electronic electronic =new Electronic("Samsung Phone",30);
	System.out.println("Electronic price: "+electronic.calculateDiscount());
	
	Clothing clothing=new Clothing("T-shirt", 20);
	System.out.println("Clothing price: "+clothing.calculateDiscount());
	
	Product product=new Product("Apple",40);
	System.out.println("Product price: "+product.calculateDiscount());
}
}
