package test.copy;

public class MainClass {
	public static void main(String[] args) {

		Manager<String, Integer> manager = new Manager("nese", 12);
		manager.addList("nese");
		manager.addList("nese1");
		manager.addList("nese2");
		manager.showList();
		System.out.println("---------------------------");
		manager.removeList("nese1");
		manager.showList();
		System.out.println(manager.getVariable1());
		System.out.println(manager.getVariable2());

		Manager<Product, String> product = new Manager<>(new Product(1, "mwk", 200), "nese2");
		Product p1 = new Product(1, "Phone", 1200);
		Product p2 = new Product(2, "Phone2", 1400);
		Product p3 = new Product(3, "Phone3", 1500);

		Product[] pList = new Product[] { p1, p2, p3 };
//	for (int i = 0; i < pList.length; i++) {
//		product.addList(pList[i]);
//	}
		for (Product product2 : pList) {
			product.addList(product2);
		}
		product.showList();

		Manager<Integer, String> number = new Manager<>(12, "whj");
		number.addList(12);
		number.addList(13);
		number.addList(14);
		number.showList();
	}
}
