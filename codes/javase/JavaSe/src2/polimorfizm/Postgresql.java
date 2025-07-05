package polimorfizm;

public class Postgresql implements IDatabase {

	@Override
	public void add() {
		System.out.println("Postgresql elave edildi");

	}

	@Override
	public void delete() {
		System.out.println("Postgresql den verilenler silindi...");

	}

	@Override
	public void update() {
		System.out.println("Postgresql de verilenler deyisdirildi..");

	}

	@Override
	public void get() {
		System.out.println("Postgresql verilenler elde edildi..");

	}

}
