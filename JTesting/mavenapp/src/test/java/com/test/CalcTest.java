package com.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import com.calc.CalcService;
import com.service.AddService;

import org.mockito.Mockito;

public class CalcTest {

	@Test
	public void testCalc()
	{
		AddService addservice;
		CalcService calcservice;
		
		addservice = Mockito.mock(AddService.class);
		calcservice = new CalcService(addservice);
		
		int num1 = 20;
		int num2 =  30;
		int expected = 50;
		
		when(addservice.add(num1, num2)).thenReturn(expected);
		int actual = calcservice.mycalc(num1, num2);
		assertEquals(expected,actual);
		
	}
}
