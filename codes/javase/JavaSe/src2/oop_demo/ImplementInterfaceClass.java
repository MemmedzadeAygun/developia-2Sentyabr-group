package oop_demo;

public class ImplementInterfaceClass implements OuterInterface, OuterInterface.InnerInterface{

	@Override
	public void innerMethod() {
		System.out.println("InnerIntrerface method is work");
	}

	@Override
	public void outerMethod() {
		System.out.println("OuterInterface method is  work");
	}


}
