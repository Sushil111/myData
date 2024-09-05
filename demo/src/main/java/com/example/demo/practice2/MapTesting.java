package com.example.demo.practice2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapTesting {
	public static void main(String[] args) {
		HashMap<String, Object> hashMap=new HashMap<>();
		hashMap.put("A", 100);
		hashMap.put("H", 300);
		hashMap.put("R", 100.0);
		hashMap.put("E", "Rain Cover");
		hashMap.put("A", "Tree saplings");
		//hashMap.put("R", 100.0);
		hashMap.put("D", 'A');
		hashMap.put("B", "Honey packets");
		System.out.println(hashMap);
		
		
		LinkedHashMap<Object, Object> linkedMap=new LinkedHashMap<>();
		linkedMap.put(101, 1000);
		linkedMap.put("StringValueTest", 2000);
		linkedMap.put(12.0, "Testing");
		linkedMap.put(101.00, 101.0000);
		linkedMap.put(null, "Null Value testing");
		linkedMap.put(null, "Null Value testing ead");
		System.out.println(linkedMap);
		
	}
	

}
