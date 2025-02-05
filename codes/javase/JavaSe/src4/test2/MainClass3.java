package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class MainClass3 {
public static void main(String[] args) {
	
	ArrayList<User> names=new ArrayList<User>();
	names.add(new User("Aygun",1,"Memmedzade"));
	names.add(new User("Elirahim",3,"Elizade"));
	names.add(new User("Cahandar",2,"Murvetov"));
	
	
	System.out.println(names);
	
	Collections.sort(names, new Comparator<User>() {

		@Override
		public int compare(User o1, User o2) {
			return o1.getId()>o2.getId()?1:-1;
		}
		
	});
	System.out.println(names);
	
	Collections.sort(names, new Comparator<User>() {

		@Override
		public int compare(User o1, User o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	});
	System.out.println(names);
	
//	ArrayList<String> names=new ArrayList<String>();
//	names.add("Aygun");
//	names.add("Emin");
//	names.add("Aygun");
//	names.add("Nigar");
//	names.add("Nigar");
//	names.add("Veli");	
//	names.add("Aygun");
//	names.add("Nigar");
//	names.add("Veli");
//	names.add("Ehmed");
	
	
}
}
