package com.example.demo.designPatterns.FactoryMethodPattern;

public class BookStoreFilling implements BookStore {

	public static void main(String[] args) {
		System.out.println("Book Storage placing !!");
		BookStoreFilling b = new BookStoreFilling();
		for (int i = 0; i < 5; i++) {
			System.out.println("Book number " + i + 1);
			b.bookFactory().read();

		}
	}

	@Override
	public Book bookFactory() {
		// TODO Auto-generated method stub
		return new BookDataManagement();
	}

}
