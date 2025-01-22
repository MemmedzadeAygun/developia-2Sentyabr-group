package main;

import java.util.HashMap;
import java.util.Map;

public class Test {
public static void main(String[] args) {
	
	Map<String, String> map=new HashMap<String, String>();
	
	map.put("Ad", "Aygun");
	map.put("Seher", "Baki");
	map.put("Dovlet", "Azerbaycan");
	
	String s="";
	int size=0;
	for (String key : map.keySet()) {
		if (key.length()>s.length()) {
			s=key;
			size=key.length();
		}
	}
	
	System.out.println(s);
	System.out.println(size);
	
	Map<String, Integer> map2=new HashMap<String, Integer>();
	
	map2.put("1", 1);
	map2.put("2", 2);
	map2.put("3", 3);
	map2.put("4", 4);
	
	int sum=0;
	for (Integer value : map2.values()) {
		sum+=value;
	}
	
	double avg=(double)sum/map2.values().size();
	System.out.println(sum);
	System.out.println(avg);
	
//	System.out.println(map);
}
}
