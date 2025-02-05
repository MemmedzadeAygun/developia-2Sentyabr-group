package polimorfizm;

 abstract class Product{
	 
	public abstract  void printInfo();
	
	public void productName(String type) {
		System.out.println(type);
	}
}

 
class Car extends Product{

	@Override
	public void printInfo() {
		System.out.println("Car class..");
	}
	
}
 

public class MainClass5 {

	public static void main(String[] args) {
		
		Product p=new Car();
		p.printInfo();
	}

}
