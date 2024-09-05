package com.example.demo.practice2;

import java.util.Scanner;

public class EnumTest3 {
	enum status {
		STARTED, TRAVELL, REACHED, CLOSED;

	}

	public void checkStatus() {
		switch (status.valueOf("STARTED")) {
		case STARTED:
			System.out.println("Journey started !");
			break;
		case TRAVELL:
			System.out.println("Journey in progress !");
			break;
		case REACHED:
			System.out.println("Journey completed");
			break;
		case CLOSED:
			System.out.println("Jouney done");
			break;
		default:
			System.out.println("Journey related information !");
		}
	}

	private static status s;

	public static void main(String[] args) throws IllegalArgumentException {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		// s = status.CLOSED;
		switch (status.valueOf(s1)) {
		case STARTED:
			System.out.println("Journey started !");
			break;
		case TRAVELL:
			System.out.println("Journey in progress !");
			break;
		case REACHED:
			System.out.println("Journey completed");
			break;
		case CLOSED:
			System.out.println("Jouney done");
			break;
		default:
			System.out.println("Journey related information !");
		}

		// EnumTest3 e = new EnumTest3();
		// e.checkStatus();
		enum e1 {
			TEST;
		}
		e1 t;
		Object obj[] = status.values();
		for (Object obj1 : obj) {
			System.out.println(obj1);
		}
		// System.out.println(status.valueOf(null, s1));
		sc.close();
	}

}
