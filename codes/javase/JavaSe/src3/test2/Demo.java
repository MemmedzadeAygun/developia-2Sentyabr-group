package test2;

import java.util.ArrayList;
import java.util.Vector;

public class Demo {
public static void main(String[] args) {
	
	ArrayList<Integer> arrayList=new ArrayList<Integer>();
	
//	for (int i = 10; i < 50; i+=2) {
////		if (i%2==0) {
////			arrayList.add(i);
////		}
//		arrayList.add(i);
//	}
//	System.out.println(arrayList);
	
	
	
	ArrayList<String> list=new ArrayList<String>();
	list.add("Neriman"); //Emin
	list.add("Lacin");
	list.add("Elsad");
	list.add("Fexriyye");
	list.add("Cahandar");
	list.add("Aydin");
	list.add("Fuad");
	list.add("Elirahim");
	list.add("Emin");
	
	for (int i = 0; i < list.size()/2; i++) {
		String firstElement=list.get(i);
		list.set(i, list.get(list.size()-1-i));
		list.set(list.size()-1-i, firstElement);
		
	}
	System.out.println(list);
	
//	String firstElement=list.get(0);
//	list.set(0, list.get(list.size()-1));
//	list.set(list.size()-1, firstElement);
//	System.out.println(list);
}
}
