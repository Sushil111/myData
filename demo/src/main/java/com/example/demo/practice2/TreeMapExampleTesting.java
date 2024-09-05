package com.example.demo.practice2;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExampleTesting {
	public static void main(String[] args) {
		TreeMap<Object, Object> treeM =new TreeMap<Object, Object>();
		treeM.put(100, "tREEmAPeXAMPLE");
		treeM.put(101, 1001);
		//treeM.put("A", "skumari");
		//treeM.put(null, "tree plantation");
		System.out.println(treeM);
	    
		TreeMap<Object, Object> tweeMap=new TreeMap<>(new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				String s1=o1.toString();
				String s2=o2.toString();
				// TODO Auto-generated method stub
				return ( s1.compareTo(s2));
			}
		});
		tweeMap.put(1000, "Absolute cold");
		tweeMap.put("1001", 1001.0);
		tweeMap.put("sushilkumari", 2000.00);
		System.out.println(tweeMap);
		
	}


	

}
