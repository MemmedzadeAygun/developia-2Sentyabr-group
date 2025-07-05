package oop_polimorfizm;

public class Airplane extends Transport implements Vehicle {

	private static final double speed = 400.0;

	public Airplane(String brand) {
		super(brand);
	}

	@Override
	public void move() {
		System.out.println(getBrand() + " teyyaresi havada ucur...");

	}

	@Override
	public void stop() {
		System.out.println(getBrand() + " teyyaresi enis etdi ve dayandi...");

	}

	@Override
	public double calculateTravelTime(double distance) {
		return distance / speed;
	}

}
