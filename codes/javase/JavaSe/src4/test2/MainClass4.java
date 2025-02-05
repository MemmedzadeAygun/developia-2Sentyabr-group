package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class MainClass4 {
public static void main(String[] args) {
	
//	Map<String, String> originalMap=new HashMap<String, String>();
//	originalMap.put("Ad", "Aysel");
//	originalMap.put("Şəhər", "Bakı");
//	originalMap.put("Dovlet", "Azerbaycan");
//	
//	HashMap<String, Integer> keyLengthMap=new HashMap<String, Integer>();
//	for (String key : originalMap.keySet()) {
//		int keyLength=key.length();
//		keyLengthMap.put(key, keyLength);
//	}
//	
//	System.out.println(keyLengthMap);
	
	HashMap<Integer, String> map=new HashMap<Integer, String>();
	map.put(1, "One");
	map.put(2, "Two");
	map.put(3, "Three");
	map.put(4, "Four");
	int removeKey=2;
	if (map.containsKey(removeKey)) {
		map.remove(removeKey);
		System.out.println("Acar silindi, yenilenmis map: "+map);
	}
	else {
		System.out.println("Acar tapilmadi");
	}
}
}
