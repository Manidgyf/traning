package com.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	static Calculator cal;
	
	@BeforeAll
	public static void beforeAll()
	{
		cal = new Calculator();
	}
	@BeforeEach
	public void callBeforeApp()
	{
		
		System.out.println("called before each....");
	}
	@Test
	void testAdd() {
	
		assertEquals(10, cal.add(5, 5));
	}
	@Test
	void testMul()
	{
		
		assertEquals(25, cal.mul(5, 5));
	}
	
	@Test
	void testDiv()
	{
		
		assertEquals(1, cal.div(5, 5));
	}
	@AfterEach
	public void callAfterApp()
	{
		System.out.println("called after each ....");
	}

}
