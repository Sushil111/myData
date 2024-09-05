package com.example.demo.practice;

public class ThreadCommunicationExample2 {
	public static void main(String[] args) {
		
	
	ThreadTest test=new ThreadTest();
	Thread t1=new Thread(new Runnable() {

		@Override
		public void run() {
			test.part1();
			
		}});
	
	
	Thread t2=new Thread(new Runnable() {

		@Override
		public void run() {
			try {
				test.part2();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}});
	
	 t2.start();
     t1.start();
	}
	
	
	
}


