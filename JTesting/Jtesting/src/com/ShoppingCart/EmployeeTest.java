package com.ShoppingCart;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class EmployeeTest {

	
	@Parameter(0)
	public int inc;
	@Parameter(1)
	public int leaves;
	@Parameter(2)
	public int hra;
	@Parameter(3)
	public int fsal;


	@Parameters
	public static Collection<Object[]> data()
	{
		Object[][] vals = new Object[][]{ {10,2,3,11},{5,3,1,3}};
				return Arrays.asList(vals);
	}
  class Employee {
		public int fSal(int income,int leaves,int hra)
		{
			return (income+hra-leaves);
		}
		
	}
 
	@Test(timeout=1000)
	public void testFsal() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
		}
		Employee e1 = new Employee();
		assertEquals(fsal, e1.fSal(inc,leaves,hra));
	}

}
