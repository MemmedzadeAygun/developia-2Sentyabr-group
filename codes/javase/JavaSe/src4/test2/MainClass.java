package test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
public static void main(String[] args) {
	
	ArrayList<String> names=new ArrayList<String>();
	names.add("Aygun");
	names.add("Emin");
	names.add("Aygun");
	names.add("Nigar");
	names.add("Nigar");
	names.add("Veli");	
	names.add("Aygun");
	names.add("Nigar");
	names.add("Veli");
	names.add("Ehmed");
	
	Map<String, Integer> map=new HashMap<String, Integer>(); //Aygun 3 Emin 1
	map.put("Aygun", 2);
	map.put("Nigar", 3);
	map.put("Ehmed", 4);
	map.put("Nihad",5);
	
//	for (String m : map.keySet()) {
//		System.out.println(m+" "+map.get(m));
//	}
	
//	for (Integer m : map.values()) {
//		System.out.println(m);
//	}
	
//	map.forEach((key,value)->System.out.println("KEy: "+key+" "+"Value: "+value));
	
//	for (String name : names) {
//		if (map.containsKey(name)) {
//			int count=map.get(name);
//			count++;
//			map.replace(name, count);
//		}else {
//			map.put(name, 1);
//		}
//	}
//	
//	System.out.println(map);

}
}
