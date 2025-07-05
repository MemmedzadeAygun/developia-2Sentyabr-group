package demo;

import java.util.ArrayList;

public class MClass {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Alma");
		list.add("Banan");
		list.add("Portağal");
		list.add("Üzüm");

		System.out.println("Orijinal siyahı: " + list);

		// Yeni tərsinə çevrilmiş siyahı yaradın
		ArrayList<String> reversedList = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			reversedList.add(list.get(i));
		}

		System.out.println("Tərsinə çevrilmiş siyahı: " + reversedList);
	}
}
