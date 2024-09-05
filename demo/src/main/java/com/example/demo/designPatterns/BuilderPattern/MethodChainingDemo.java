package com.example.demo.designPatterns.BuilderPattern;

public class MethodChainingDemo {
	public static void main(String args[]) {
		Student student1 = new Student();
		Student student2 = new Student();

		student1.setId(1).setName("Ram").setAddress("East Gurgaon");
		student2.setId(2).setName("Shyam").setAddress("Delhi");

		System.out.println(student1);
		System.out.println(student2);

		/*
		 * Student student3 = new Student(); Student student4 = new Student();
		 *
		 * student3.setId(1) .setName(&quot; Ram & quot;) .setAddress(&quot; Noida &
		 * quot;); student4.setId(2) .setName(&quot; Shyam & quot;) .setAddress(&quot;
		 * Delhi & quot;);
		 *
		 * System.out.println(student1); System.out.println(student2);
		 */ }

}
