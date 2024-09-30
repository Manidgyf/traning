package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.WelcomeDaoImpl;
import com.advice.AdviceClass;
import com.advice.AdviceClass2;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com")
public class WelcomeConfig {
	
	@Bean
	public WelcomeDaoImpl getobj()
	{
		return new WelcomeDaoImpl();
	}
	
	@Bean
	public AdviceClass getadvice()
	{
		return new AdviceClass();
	}

	@Bean
	public AdviceClass2 getadvice2()
	{
		return new AdviceClass2();
	
}
}
