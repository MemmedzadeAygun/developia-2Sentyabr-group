package oop_polimorfizm;

public class Car extends Transport implements Vehicle {

	public Car(String brand) {
		super(brand);
	}

	private static final double speed=200.0;

	@Override
	public void move() {
		System.out.println(getBrand()+" avtomobili yolda hereket edir...");
		
	}

	@Override
	public void stop() {
		System.out.println(getBrand()+" avtomobili dayandi...");
		
	}

	@Override
	public double calculateTravelTime(double distance) {
		return distance/speed;
	}
	
	
}
