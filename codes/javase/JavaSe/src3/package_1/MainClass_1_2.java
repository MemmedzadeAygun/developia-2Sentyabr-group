package package_1;

import java.util.HashSet;
import java.util.Scanner;

public class MainClass_1_2 {
	public static void main(String[] args) {
		// HasSet
		// LinkedHasSet
		// TreeSet

		// 1.Set de eyni element 2ci defe yaradila bilmez
		// 2.Index olmur

		HashSet<String> st = new HashSet<String>();
		st.add("Aydin");
		st.add("Elirahim");
		st.add("Elsad");
		st.add("Fexriyye");
//	System.out.println(st.add("Aydin"));
		System.out.println(st);

		Scanner sc = new Scanner(System.in);
		System.out.println("Datalarinizi daxil edin: ");

		boolean userAccess = false;
		do {
			String username = sc.nextLine();
			if (st.add(username)) {
				System.out.println("Istifadeci etribalidir");
				userAccess = true;
			} else {
				System.out.println("Istifadeci etibarsizdir, yeniden daxil edin:");
			}

		} while (!userAccess);

	}
}
