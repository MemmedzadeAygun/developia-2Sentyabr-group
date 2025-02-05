package test.copy;

import java.util.ArrayList;
import java.util.List;

//Generic classS
public class Manager<T,U> {
	
	private T variable1;
	private U variable2;


	public Manager(T variable1, U variable2) {
		this.variable1 = variable1;
		this.variable2 = variable2;
	}
	
	public T getVariable1() {
		return variable1;
	}
	
	public U getVariable2() {
		return variable2;
	}

	List<T> siyahi=new ArrayList<>();

	
	public T addList(T item) {
		siyahi.add(item);
		return item;
	}
	
	public U removeList(T item) {
		siyahi.remove(item);
		return variable2;
	}
	
	public void showList() {
//		System.out.println(siyahi);
		System.out.print("[");
		for (int i = 0; i < siyahi.size(); i++) {
			System.out.print(siyahi.get(i));
			if (i<siyahi.size()-1) {
				System.out.print(",");
			}
			System.out.println();
		}
		System.out.println("]");
	}
}
