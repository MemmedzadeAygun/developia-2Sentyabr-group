package oop_demo;

public class MainClass2 {
	public static void main(String[] args) {
		Computer c1 = new Computer("nitro5", 12);

		OuterInterface outer = new ImplementInterfaceClass();
		outer.outerMethod();

		OuterInterface.InnerInterface inner = new ImplementInterfaceClass();
		inner.innerMethod();

	}
}
