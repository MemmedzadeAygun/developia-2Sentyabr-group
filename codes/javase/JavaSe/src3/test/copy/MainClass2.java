package test.copy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class MainClass2 {
	public static void main(String[] args) {

		HashSet<String> st = new HashSet<String>();
//		LinkedHashSet<String> st=new LinkedHashSet<String>();
//		TreeSet<String> st=new TreeSet<String>();
		st.add("Fuad");
		st.add("Neriman");
		st.add("Fexriyye");
		st.add("Elsad");
		st.add("Lacin");
		st.add("Aydin");
		st.add("Elirahim");
		st.add("Emin");
		st.add("Cahandar");
		if (st.remove("a")) {
			System.out.println("Istifadeci silindi");
		}else {
			System.out.println("Silinmedi");
		}
//		st.clear();
		System.out.println(st.add("Cahandar")); // false
		
		
		System.out.println(st);
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Istifadeci adinizi daxil edin: ");
//
//
//		boolean userAcceped = false;
//
//		do {
//			String username = sc.nextLine();
//			if (st.add(username)) {
//				System.out.println("Istifadeci ugrlurla elave edildi");
//				userAcceped = true;
//			} else {
//				System.out.println("Istifadeci adi etirbarsizdir, zehmet olmasa yenisini qeyd edin:");
//			}
//		} while (!userAcceped);

	}
}
