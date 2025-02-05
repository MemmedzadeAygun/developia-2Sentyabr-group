package oop_test.copy;

public class MainClass {
public static void main(String[] args) {
	Product p1=new Product("Telefon",1200,23);
	Product p2=new Product("Telefon",1200,23);
	Product p3=new Product("Telefon",1200,23);
	
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	System.out.println(p3.toString());
}
}
