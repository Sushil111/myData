package com.example.demo.practice;

public class AbstractClassExampleImpl extends AbstractClassExample {

	public AbstractClassExampleImpl(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Abstract class example }");
	}
	
	public static void main(String[] args) {
		
		AbstractClassExampleImpl absClass =new AbstractClassExampleImpl(10);
		System.out.println("Abstract class properties :"+absClass.x+"____Properties2___"+
		absClass.subtract(50, 20)+"----Properties 3-----");
		absClass.add();
		
		
		
	}
	

}
