package test2;

import java.util.ArrayList;
import java.util.HashSet;

public class MainClass_3_1 {
	public static void main(String[] args) {

//		int[] array= {1,2,4};

		ArrayList<String> list = new ArrayList();
		list.add("hagsd");
		list.add("nese");
		list.add("alma");
		list.remove(0);
		System.out.println(list);

		// HasSet
		// LinkedHasSet
		// TreeSet

		HashSet<String> st = new HashSet<String>();
//		LinkedHashSet<String> st=new LinkedHashSet<String>();
//		TreeSet<String> st=new TreeSet<String>();
		st.add("Eli");
		st.add("Veli");
		st.add("Xedice");
		st.add("Ehmed");
		st.add("Nermin");

//		System.out.println(st.add("Eli"));
		System.out.println(st);
//		if (st.remove("Xedice")) {
//			System.out.println("Silindi");
//		}else {
//			System.out.println("Silinmedi");
//		}
//		st.clear();
		System.out.println(st.isEmpty());
//		System.out.println(st.contains("Veli"));

		System.out.println(st);
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Istifadeci adinizi daxil edin:");
//		boolean userAccpeted=false;
//		do {
//			String username = sc.nextLine();
//			if (st.add(username)) {
//				System.out.println("Istifadeci etirbalidir");
//				userAccpeted=true;
//			} else {
//				System.out.println("Istifadeci etibasizdir zehmet olmasa yeniden daxil edin: ");
//			}
//		} while (!userAccpeted);

	}
}
