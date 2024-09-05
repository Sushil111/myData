package com.example.demo.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x=0;
	static int j=10;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Test_N test=new Test_N();
		
		FileOutputStream fos= new FileOutputStream("abr.txt");
		ObjectOutputStream outputStream= new ObjectOutputStream(fos);
		outputStream.writeObject(test);
		outputStream.close();
        System.out.println("Object closed ");
        test.r=700;
        FileInputStream fis =new FileInputStream("abr.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Test_N test1=(Test_N) ois.readObject();
	    System.out.println(test1.x+" "+test1.d+" "+test1.s+" "+test1.var+" "+test1.r);	
	    ois.close();
        System.out.println("Object closed");
	}
	
	
	
	

}
