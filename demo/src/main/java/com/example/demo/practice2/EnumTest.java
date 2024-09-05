package com.example.demo.practice2;

import lombok.Data;

@Data
public class EnumTest {

	public enum enum1 {

		JANUARY, February;
	}

	// private enum1 enum0;

	public boolean checkStatus() {
		if ("".equals(enum1.JANUARY)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		EnumTest e = new EnumTest();
		System.out.println(e.checkStatus());
	}
}
