package com.example.demo.java8examples;

import java.lang.reflect.Method;
import java.util.Optional;

public class OptionalClassExample {
	public static void main(String[] args) {
		Student s1 = new Student();

		// Optional class simple test 1
		Optional<Student> op = Optional.ofNullable(s1);
		if (op.isPresent()) {
			System.out.println(op.get().getName() + " " + op.get().getX());
		}

		// Optional class simple test 2
		Optional<String> op1 = Optional.ofNullable("Test");
		if (op1.isEmpty()) {
			System.out.println("Not required !!");
		} else {
			System.out.println(op1.get());
		}

		// Optional class equals method test
		Optional<String> op4 = Optional.ofNullable("Test");
		if (op4.isEmpty()) {
			System.out.println("Not required !!");
		} else {
			System.out.println(op1.get());
		}
		// Optional class methods
		Method[] m = op1.getClass().getDeclaredMethods();
		for (Method m1 : m) {
			System.out.println(m1);
		}

		Optional<String> op3 = Optional.empty();
		// System.out.println(op3.get());
		System.out.println(op4.equals(op1));

	}

}
