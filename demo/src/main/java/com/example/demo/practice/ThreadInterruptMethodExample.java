package com.example.demo.practice;

public class ThreadInterruptMethodExample extends Thread{
	public void run ()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("I am lazy thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
}
