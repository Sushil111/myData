package com.example.demo.practice;

public class ThreadTest {
	
	boolean  bool=false;
	synchronized void part1()
	{
		System.out.println("Thread testing !!");
		bool=true;
		System.out.println("Calling notify method !");
		notify();
	}
	synchronized void part2() throws InterruptedException
	{
		while(!bool)
		{
			wait();
		}
		
		System.out.println("Wait method testing !!");
		
	}

}
