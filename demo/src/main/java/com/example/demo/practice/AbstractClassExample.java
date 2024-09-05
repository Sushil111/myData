package com.example.demo.practice;

public abstract class AbstractClassExample {
	
	int x=5;
	
	public abstract void add();
	
	public int subtract(int x,int y )
	{
		return x-y;
	}
	
	public AbstractClassExample(int x)
	{
		//System.out.println("Abstract class constructor ..!!");
		this.x=x;
	}

}
