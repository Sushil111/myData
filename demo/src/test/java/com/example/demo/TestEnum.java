package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.demo.practice2.EnumTest2;

public class TestEnum {

	@Test
	public void test1() {
		EnumTest2 enumt = new EnumTest2();
		// EnumTest2.pizzaStatus.
		// enumt.status = EnumTest2.pizzaStatus.ORDERED;
		assertTrue(enumt.isDelivered());
		assertTrue(EnumTest2.pizzaStatus.COOKED.isCooked());
		assertThat(enumt.isDelivered() == true);
		assertFalse(enumt.isDelivered() == false);
		// assertTrue(EnumTest2.class.componentType() == null);
	}

}
