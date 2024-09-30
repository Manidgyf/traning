package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.InterestCalculator;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.*;


@AllArgsConstructor
public class CalculatorService {

	InterestCalculator ic;
	
	public double serve(double amt)
	{
		return ic.interestCalculate(amt);
	}

	public CalculatorService() {
		
		System.out.println("subbu");
	}
	@PostConstruct
	public void init()
	{
		System.out.println("hi nanna ");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("sir is where");
		
	}
}
