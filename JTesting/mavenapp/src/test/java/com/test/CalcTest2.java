package com.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import com.calc.CalcService;
import com.service.AddService;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CalcTest2 {

	@Mock
	AddService addservice;
	
	@Before
	public void init()
	{
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testCalc()
	{
	
		CalcService calcservice;
		
		
		calcservice = new CalcService(addservice);
		
		int num1 = 20;
		int num2 =  30;
		int expected = 50;
		
		when(addservice.add(num1, num2)).thenReturn(expected);
		int actual = calcservice.mycalc(num1, num2);
		assertEquals(expected,actual);
		
	}
}
