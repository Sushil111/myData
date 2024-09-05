package com.example.demo.practice;

public class ThreadPriority {
	public static void main(String[] args) {
		//Thread t1=new Thread();
		//t1.setPriority(7);
		//t1.start();
		//t1.
		Thread t1=new Thread(new ThreadExample());
		t1.setPriority(7);
		t1.start();
        System.out.println("Main thread run..");
	    System.out.println("Child thread priority :"+t1.getPriority());	
	   // System.out.println("Main thread priority :"+Thread.currentThread().getPriority());
	    Thread.currentThread().setPriority(8);
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
