package oop_polimorfizm;

public class Bicycle extends Transport implements Vehicle {

	public Bicycle(String brand) {
		super(brand);
	}

	private static final double speed = 400.0;

	@Override
	public void move() {
		System.out.println(getBrand() + " velosipedi cigirda hereket edir...");

	}

	@Override
	public void stop() {
		System.out.println(getBrand() + " velosipedi dayandi...");

	}

	@Override
	public double calculateTravelTime(double distance) {
		return distance / speed;
	}

}
