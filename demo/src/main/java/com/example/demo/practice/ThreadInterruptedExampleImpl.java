package com.example.demo.practice;

public class ThreadInterruptedExampleImpl {
	public static void main(String[] args) {
		ThreadInterruptMethodExample threadInterruptedExample=new ThreadInterruptMethodExample();		
		threadInterruptedExample.start();
        threadInterruptedExample.interrupt();
        System.out.println("Main thread impl.. ");
	}

}
