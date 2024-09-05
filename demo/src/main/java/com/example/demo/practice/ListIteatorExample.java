package com.example.demo.practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteatorExample {
	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("Baye");
		linkedList.add("Tsiio");
		linkedList.add("Kumari");
		ListIterator<String> listIterator=linkedList.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
			
		}
		listIterator.set("Sghik");
		System.out.println(linkedList);
		linkedList.remove();
		System.out.println(linkedList);
		
		
		
	}

}
