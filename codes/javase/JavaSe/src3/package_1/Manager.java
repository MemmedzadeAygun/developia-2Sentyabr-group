package package_1;

import java.util.ArrayList;

public class Manager<T> {

	ArrayList<T> siyahi = new ArrayList<T>();

	public void addList(T item) {
		siyahi.add(item);
	}

	public void removeList(T item2) {
		siyahi.remove(item2);
	}

	public void showList() {
		for (T t : siyahi) {
			System.out.println(t);
		}
	}
}
