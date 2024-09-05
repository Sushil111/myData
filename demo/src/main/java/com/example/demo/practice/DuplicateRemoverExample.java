package com.example.demo.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class DuplicateRemoverExample {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//PrintWriter pw=new PrintWriter("ab.txt");
		BufferedReader br1=new BufferedReader(new FileReader("ahg.txt"));
		
		String line=br1.readLine();
		//BufferedReader br2=new BufferedReader(new FileReader("ab.txt"));
		//String newLine=br2.readLine();
		int counter=0;
		boolean flag= false;
		BufferedWriter pw=new BufferedWriter(new FileWriter("ab.txt"));
		//BufferedReader br2=new BufferedReader(new FileReader("ab.txt"));
		while(line!=null)
		{
			flag=false;
			if(counter==0)
			{
				pw.write(line);
				System.out.println(line);
				//System.out.println(line);
				//pw.print(line);
				pw.write("\n");
				pw.flush();
				counter++;
			}
			else
			{
			   BufferedReader br2=new BufferedReader(new FileReader("ab.txt"));
			    String lineN=br2.readLine();
			    while(lineN!=null)
			    {
			    	if(lineN.equals(line))
			    	{
			    		flag=true;
			    		break;
			    	}
			    	lineN=br2.readLine();
			    	//br2.close();
			    }
			    if(flag==false)
			    {
			  // BufferedWriter pwe=new BufferedWriter(new FileWriter("ab.txt"));
				pw.write(line);
				System.out.println(line);
			    pw.write("\n");
			    pw.flush();
			   // pw.close();
			    }
			    br2.close();
			}
			
			line=br1.readLine();
			
		}
			
			//boolean available=false;
			/*BufferedReader br2=new BufferedReader(new FileReader("ab.txt"));
			if(!line.equals(br2.readLine()))
			{
				if(counter==0)
				{
				   counter++;
				}
				if(counter==1 )
				{
					pw.write(line);
					
					BufferedReader br=new BufferedReader(new FileReader("ab.txt"));
					String newLine=br.readLine();
					while(newLine!=null)
					{
					 if(line.equals(newLine))
					 {
						 break;
					 }else
					 {
						 newLine=br.readLine();
					 }
					 
					}
					pw.write("\n");
					br.close();
				}
			}
			
			
			
			line=br1.readLine();
		} */
		br1.close();
        pw.close();
       // br2.close();
	}
  }



