package test2;

public class MainClass_3 {
	public static void main(String[] args) {

		Box<String> box = new Box<>();
		box.setValue("nese");
		System.out.println(box.getValue());

		Box<Integer> box2 = new Box<>();
		box2.setValue(12);
		System.out.println(box2.getValue());
	}
}
