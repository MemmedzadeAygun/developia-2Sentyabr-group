package demo;

public class Main2 {
public static void main(String[] args) {
	Developer d1=new Developer("Jhon","Wick","IT",3000);
	d1.printInfo();
	
	Pen p1=new Pen();
	d1.setPen(p1);
}
}
