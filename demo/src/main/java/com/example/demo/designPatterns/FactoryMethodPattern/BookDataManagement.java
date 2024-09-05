package com.example.demo.designPatterns.FactoryMethodPattern;

public class BookDataManagement implements Book {

	@Override
	public void read() {
		System.out.println("New Book Data Loading ..");
	}

}
