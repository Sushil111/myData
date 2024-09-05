package com.example.demo.practice;

public class ThreadExample implements Runnable{

	@Override
	public void run() {
		synchronized (this) {
			
		
		for(int i=0;i<10;i++)
		{
		// TODO Auto-generated method stub
		System.out.println("Inherited Run method");
		Thread.yield();
		
		try {
			Thread.sleep(2000);
			
			//testing wait method also in this program
			//this.wait();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	 }
}
	
	

}
