package com.example.demo.practice;

public class ThreadCommunicationExample {
	public static void main(String[] args) throws InterruptedException {
	
	ThreadExample threadExample=new ThreadExample();
	
	Thread thread1=new Thread(threadExample);
	thread1.start();
	//thread1.join(1000);
	synchronized(thread1)
    {
    thread1.wait(100000);
    System.out.println("Waiting thread");
	thread1.notify();
	
    }
    System.out.println("Main method examples ");
    
}
	
}
