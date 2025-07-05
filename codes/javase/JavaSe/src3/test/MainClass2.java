package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class MainClass2 {
	public static void main(String[] args) {

//	int[] arr= {12,34,5,"gweg"};

//	Object[] arr2= {12.43,46,"jhjwq"};

		Vector vector = new Vector<>(4, 3);

		vector.add("Xedice");
		vector.add("Eli");
		vector.add("Veli");
		vector.add("Ehmed");
		vector.add("Xedice");
		vector.add("Eli");
		vector.add("Veli");
		vector.add("Ehmed");
//	vector.add("Xedice");
//	vector.add("Eli");
//	vector.add("Eli");

		System.out.println(vector.size());
		System.out.println(vector.capacity());

		ArrayList<String> siyahi = new ArrayList<>();
		siyahi.clear();

		LinkedList linked = new LinkedList<>();

		linked.add(12);
		linked.add("sajdbj");
		linked.add(true);
		linked.add(false);

		for (Object l : linked) {
			System.out.println(l);
		}

		linked.remove(1);
		linked.remove(2);
		System.out.println(linked);

//	siyahi.add("Neriman");
//	siyahi.add("Fexriyye");
//	siyahi.add("Emin");
//	siyahi.add("Elsad");
//	siyahi.add("Fuad");
//	siyahi.add("Cahandar");
//	siyahi.add("Elirahim");
//	siyahi.add("Aydin");
//	siyahi.add("Lacin");

		/*
		 * siyahi.add(12); siyahi.add(34.6); siyahi.add("Emin"); siyahi.add('f');
		 * siyahi.add("Fuad"); siyahi.add(true); siyahi.add(false); siyahi.add(null);
		 * siyahi.add("Lacin");
		 * 
		 * System.out.println(siyahi.get(0)); System.out.println(siyahi.get(1));
		 * System.out.println(siyahi.get(2)); System.out.println(siyahi.get(3));
		 * System.out.println(siyahi.get(4)); System.out.println(siyahi.get(5));
		 * System.out.println(siyahi.get(6)); System.out.println(siyahi.get(7));
		 * System.out.println(siyahi.get(8));
		 */

//	siyahi.remove(0);
//	siyahi.remove(4);
		/*
		 * siyahi.set(1, "Alma");
		 * 
		 * System.out.println(siyahi);
		 * 
		 * System.out.println(siyahi.contains("Java"));
		 * System.out.println(siyahi.indexOf("Fuad"));
		 * System.out.println(siyahi.isEmpty()); System.out.println(siyahi.size());
		 * 
		 * siyahi.clear(); System.out.println(siyahi);
		 */

	}
}
