package com.example.demo.practice2;

import java.lang.reflect.Array;

public class ArrayExampleTestReflection2 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> cls=Class.forName("java.lang.String");
		Object arr=Array.newInstance(cls, 10);
		Array.set(arr, 5, "this is a test");
		String s=(String) Array.get(arr, 5);
		System.out.println(s);
	}

}
