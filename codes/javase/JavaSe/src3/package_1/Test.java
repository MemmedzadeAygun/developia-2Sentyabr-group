package package_1;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();
		for (int i = 10; i < 50; i += 2) {
//		if (i%2==0) {
//			number.add(i);
//		}
			number.add(i);
		}
		System.out.println(number);

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("Fuad"); // Emin
		arrayList.add("Cahandar");
		arrayList.add("Elirahim");
		arrayList.add("Aydin");
		arrayList.add("Neriman");
		arrayList.add("Elsad");
		arrayList.add("Fexriyye");
		arrayList.add("Lacin");
		arrayList.add("Emin");

//	String element=arrayList.get(0);
//	arrayList.set(0, arrayList.get(arrayList.size()-1));
//	arrayList.set(arrayList.size()-1, element);
//	System.out.println(arrayList);

		for (int i = 0; i < arrayList.size() / 2; i++) {
			String element = arrayList.get(i);
			arrayList.set(i, arrayList.get((arrayList.size() - 1) - i));
			arrayList.set((arrayList.size() - 1) - i, element);

		}
		System.out.println(arrayList);

//	for (int i = 0; i < arrayList.size()/2; i++) {
//		String firstElement=arrayList.get(i);
//		arrayList.set(i, arrayList.get(arrayList.size()-1-i));
//		arrayList.set(arrayList.size()-1-i, firstElement);
//	}
//	System.out.println(arrayList);

//	System.out.println(arrayList);
	}
}
