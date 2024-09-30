package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.WelcomeDao;
import com.config.WelcomeConfig;

public class WelcomeMain {

	public static void main(String[] args) {
		ApplicationContext ns = new AnnotationConfigApplicationContext(WelcomeConfig.class);
		WelcomeDao wd  = (WelcomeDao)ns.getBean("getobj");
		System.out.println(wd.sayHello("UNDER WHERE!!"));
//		wd.sayWelcome();
//		int w = wd.calculate(1, 2);
//		System.out.println(w);
//		wd.venky();
		
	}
}
