package package_1;

public class MainClass {
	public static void main(String[] args) {

		Manager<String> m = new Manager<>();
		m.addList("Phone");
		m.addList("Television");
		m.addList("radio");
		m.addList("Pen");
		m.showList();
		m.removeList("Phone");
		m.showList();

		Manager<Integer> m2 = new Manager<>();
		m2.addList(1);
		m2.addList(2);
		m2.addList(3);
		m2.addList(4);
		m2.showList();

		Manager<Product> product = new Manager<>();
		product.addList(new Product(1, "alma", 1));
		product.addList(new Product(2, "armud", 1.4));
		product.addList(new Product(3, "nar", 1.5));
		product.showList();
	}
}
