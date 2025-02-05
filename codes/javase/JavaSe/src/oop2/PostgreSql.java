package oop2;

public class PostgreSql implements IDatabase {


	@Override
	public void add() {
		System.out.println("PostgreSql elvae edildi..");
		
	}

	@Override
	public void get() {
		System.out.println("PostgreSql verilenleri elde edildi");
		
	}

	@Override
	public void delete() {
		System.out.println("PostgreSql verilenleri silindi");
		
	}

	@Override
	public void update() {
		System.out.println("PostgreSql verilenleri update edildi..");
		
	}

}
