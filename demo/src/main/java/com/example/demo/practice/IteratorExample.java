package com.example.demo.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		for(int x=0;x<10;x++)
		{
			arrayList.add(x);      
	    }
		
		Iterator<Integer> itr=arrayList.iterator();
		System.out.println("Iterting over even integers :");
		while(itr.hasNext())
		{
			int i=itr.next();
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
