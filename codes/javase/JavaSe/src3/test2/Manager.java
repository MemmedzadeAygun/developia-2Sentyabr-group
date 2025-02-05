package test2;

import java.util.ArrayList;

//Generic class
public class Manager<T,U> {

	private T variable;
	private U variable2;
	
	ArrayList<T> list=new ArrayList<T>();
	
	public void addList(T item) {
		list.add(item);
	}
	
	public void removeList(T item) {
		list.remove(item);
	}
	
	public void showList() {
		for (T s : list) {
			System.out.println(s);
		}
	}
}
