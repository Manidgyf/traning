package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.model.FixedAcc;
import com.model.SavingsAcc;
import com.service.CalculatorService;

@Configuration
public class ConfigClass {

	@Bean
	public FixedAcc fda()
	{
		return new FixedAcc(500,5);
	}
	
	@Bean
	public SavingsAcc sa()
	{
		return new SavingsAcc(50,3);
	}
	
	@Bean
	public CalculatorService service()
	{
		return new CalculatorService(fda());
	}
}
