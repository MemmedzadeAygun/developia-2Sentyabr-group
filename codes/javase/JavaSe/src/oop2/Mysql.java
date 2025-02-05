package oop2;

public class Mysql implements IDatabase {

	@Override
	public void add() {
		System.out.println("Mysql elvae edildi..");
		
	}

	@Override
	public void get() {
		System.out.println("Mysql verilenleri elde edildi");
		
	}

	@Override
	public void delete() {
		System.out.println("Mysql verilenleri silindi");
		
	}

	@Override
	public void update() {
		System.out.println("MySql verilenleri update edildi..");
		
	}

	
}
