package oop_test;

public class MainClass {
public static void main(String[] args) {
	
	Bank b1=new Bank("Kapital","Nizami");
	Bank b2=new Bank("Kapital","Nizami");
	
	String s="ALma";
	
	System.out.println(b1.equals(b2));
	
	System.out.println(b1.hashCode());
	System.out.println(b2.hashCode());
	
	b2=null;
	System.gc();
	
	
//	String s1="Alma";
//	String s2="Alma";
//	System.out.println(s1.equals(s2));
	
	/*System.out.println(b1.toString());
	System.out.println(b2);*/
}
}
