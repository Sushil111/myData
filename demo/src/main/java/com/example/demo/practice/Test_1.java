package com.example.demo.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test_1 extends Test_N{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter("ahw.txt"));
		bw.write("thfgsdhdf");
		bw.write("\n");
		bw.write("sdsfddgvfgh");
		bw.write("\n");
		bw.write(100);
		bw.close();
		BufferedReader br=new BufferedReader(new FileReader("ahw.txt"));
        String line=br.readLine();
        while(line!=null)
        {
        	System.out.println(line);
        	line=br.readLine();
        }
		bw.close();br.close();
	}

}
