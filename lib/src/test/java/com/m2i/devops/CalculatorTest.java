package com.m2i.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int a = 2;
		int b = 3;
		
		calculator calc = new calculator();
		int actual = calc.add(a, b);
		
		assertEquals(5, actual);
	}

	@Test
	public void testSub() {
		int a = 6;
		int b = 3;
		
		calculator calc = new calculator();
		int actual = calc.sub(a, b);
		
		assertEquals(3, actual);
	}
	
	@Test
	public void testMult() {
		int a =5;
		int b = 3;
		
		calculator calc = new calculator();
		int actual = calc.mult(a, b);
		
		assertEquals(15, actual);
	}
	
	@Test
	public void testMod() {
	
		calculator calc = new calculator();
		boolean actual = calc.mod(2);
		assertTrue(actual);
		
		boolean actual2 = calc.mod(3);
		assertFalse(actual2);
	}
	
}
