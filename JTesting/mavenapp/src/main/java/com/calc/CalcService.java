package com.calc;

import com.service.AddService;

public class CalcService {

	public AddService addservice;
	
	public CalcService(AddService addService)
	{
		this.addservice  = addService;
	}
	public int mycalc(int a,int b)
	{
		return addservice.add(a, b);
	}
	
}
