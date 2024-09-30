package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.ConfigClass;
import com.service.CalculatorService;


public class CalculateClient {

	public static void main(String[] args) {
		
		//ApplicationContext ns = new AnnotationConfigApplicationContext(ConfigClass.class);
		ConfigurableApplicationContext ns = new AnnotationConfigApplicationContext(ConfigClass.class);

		
		CalculatorService cs = (CalculatorService) ns.getBean("service");
		//CalculatorService cs2 = (CalculatorService) ns.getBean("service");
		
		ns.close();
		///System.out.println(cs.hashCode());
		//System.out.println(cs2.hashCode());
		System.out.println(cs.serve(500));
		
	}
}
