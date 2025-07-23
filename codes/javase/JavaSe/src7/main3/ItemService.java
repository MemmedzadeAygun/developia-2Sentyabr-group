package main3;

import java.util.ArrayList;
import java.util.List;

public class ItemService<T> {

	private final List<T> items = new ArrayList<T>();
	
	public void add(T item) {
		items.add(item);
	}
	
	public List<T> getAll(){
		return items;
	}
}
