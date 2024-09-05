package com.example.demo.practice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class FileHandlingExample {
	public static void main(String[] args) throws IOException{
		
		File file=new File("ab.text");
		
		FileWriter fileWriter =new FileWriter(file);
		fileWriter.write(100);
		fileWriter.write("\n");
		char ch1[]= {'a','b','c'};
		fileWriter.write(ch1);
		fileWriter.write("\n");
		fileWriter.write("Wsjfghfsghhfbhrbhfh");
		fileWriter.close();
		
		FileReader fileReader=new FileReader(file);
		for(int i=0;i<file.length();i++)
		{
			System.out.print((char)(fileReader.read()));
		}
		//fileReader.close();
		
		BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter("ahg.txt"));
		bufferedWriter.write("utpouuuiiooopppp");
		bufferedWriter.newLine();
		bufferedWriter.write(104);
		bufferedWriter.newLine();
        bufferedWriter.write(ch1);
        bufferedWriter.close();
        
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line=bufferedReader.readLine();
        while(line!=null)
        {
        	System.out.println(line);
        	line=bufferedReader.readLine();
        }
        
        bufferedReader.close();
        
	}
	
	

}
