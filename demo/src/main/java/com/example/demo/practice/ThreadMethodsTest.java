package com.example.demo.practice;

public class ThreadMethodsTest {
	public static void main(String[] args) throws InterruptedException {
		
		Thread.currentThread().setPriority(10);
		Thread t1 =new Thread(new ThreadExample());
		t1.start();
		t1.join(100);
		t1.join(100, 100);
        System.out.println("Main method for executing few things");
       
        System.out.println("Main thread priority :"+Thread.currentThread().getPriority());
	    t1.setPriority(Thread.MAX_PRIORITY);
	    System.out.println("Child thread priority :"+t1.getPriority());
	    t1.setPriority(Thread.MIN_PRIORITY);
	    System.out.println("Child thread priority :"+t1.getPriority());
	    t1.setPriority(Thread.NORM_PRIORITY);
	    System.out.println("Child thread priority :"+t1.getPriority());
	    System.out.println("Main thread priority :"+Thread.currentThread().getPriority());
	    
		
	}
	
	

}
