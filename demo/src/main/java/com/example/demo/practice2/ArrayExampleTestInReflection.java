package com.example.demo.practice2;

import java.lang.reflect.Array;

public class ArrayExampleTestInReflection {
	public static void main(String[] args) {
		int dims[]=new int[] {5,10,15};
		for(int x:dims)
		{
			System.out.println(x);
		}
		System.out.println(dims);
		
		Object arr=Array.newInstance(Integer.TYPE, dims);
	
		/*
		 * int arr1[][][]=(int [][][]) arr; for(int x[][]:arr1) { System.out.println(x);
		 * }
		 */
		System.out.println(arr.toString());
		Object arr1=Array.get(arr, 3);
		System.out.println(arr1.toString());
        arr1=Array.get(arr1, 5);		
        System.out.println(arr1);
        Array.setInt(arr1, 10, 23);
        int arr2[][][]=(int [][][]) arr;
        System.out.println("Value set for an element is :"+arr2[3][5][10]);
        
        
        //////////////////////////////////////
        int [] array2=new int[] {2,2};
        Object arr4=Array.newInstance(Integer.TYPE, array2);
        System.out.println(arr4.toString());
        Array.set(arr4, 0, new int[4]);
        int[][] arr6=(int[][]) arr4;
        
       // System.out.println(arr4.toString());
        Object arr5=Array.get(arr4, 0);
        System.out.println(arr5.toString());
        Array.set(arr5, 3, 10);
        System.out.println("Test Value :"+arr6[0][3]);
       
       
	}
	

}
