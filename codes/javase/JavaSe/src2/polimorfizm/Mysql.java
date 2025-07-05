package polimorfizm;

public class Mysql implements IDatabase {

	@Override
	public void add() {
		System.out.println("Mysqle elave edildi");

	}

	@Override
	public void delete() {
		System.out.println("Mysql den verilenler silindi...");

	}

	@Override
	public void update() {
		System.out.println("Mysql de verilenler deyisdirildi..");

	}

	@Override
	public void get() {
		System.out.println("Mysqlden verilenler elde edildi..");

	}

}
