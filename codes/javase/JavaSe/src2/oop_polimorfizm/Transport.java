package oop_polimorfizm;

public class Transport implements Vehicle {

	private String brand;
	private static final double speed=200.0;

	public Transport(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateTravelTime(double distance) {
		return distance/speed;
	}

	
	
}
