package demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MainClass21 {
public static void main(String[] args) {
	
//	int[] array= {12,45,6,12}; array[6]
	
	ArrayList<String> list=new ArrayList<>();

	list.add("alma");
	list.add("alma");
	list.add("alma");
	
	System.out.println(list);
//	
//	list.remove(0);
//	list.remove(4);
	
	System.out.println(list);
	System.out.println(list.get(3));
	System.out.println(list.size());
	System.out.println(list.isEmpty());
	System.out.println(list.indexOf("armud"));
	System.out.println(list.contains("java"));
}
}
