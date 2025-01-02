package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
public static void main(String[] args) {
	Map<String, String> map=new HashMap<String, String>();
	
	map.put("Ad", "Aygun");
	map.put("Seher", "Baki");
	map.put("Dovlet", "Azerbaycan");
	
	List<String> keys=new ArrayList<String>(map.keySet());
	
	String s="";
	int maxlength=0;
	for (int i = 1; i < keys.size(); i++) {
		if (keys.get(i).length()>s.length()) {
			s=keys.get(i);
			maxlength=keys.get(i).length();
		}
	}
	System.out.println("En uzun acar: "+s);
	System.out.println("max length: "+maxlength);
	
//	String length="";
//	for (String key : map.keySet()) {
//		if (key.length()>length.length()) {
//			length=key;
//		}
//	}
//	System.out.println("En uzun acar: "+length);
	
	Map<String, Integer> m=new HashMap<String, Integer>();
	m.put("First", 3);
	m.put("Second", 2);
	m.put("Third", 3);
	m.put("Fours", 4);
	
	int sum=0;
	int avg = 0;
	for (String k : m.keySet()) {
		sum+=m.get(k);
		avg=sum/m.values().size();
	}
	System.out.println(sum);
	System.out.println("Avg: "+avg);
}
}
