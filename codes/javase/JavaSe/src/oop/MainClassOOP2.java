package oop;

public class MainClassOOP2 {
	public static void main(String[] args) {
		
		Electronic el=new Electronic();
		el.update();
		el.add();
		el.delete();
		el.get();
		
		
		Car car=new Car();
		car.add();
		car.delete();
		car.get();
		car.update();
	}
}
