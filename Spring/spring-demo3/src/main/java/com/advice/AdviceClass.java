package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;


@Aspect
public class AdviceClass {

	@Before("execution(* com.WelcomeDaoImpl.sayHello(..))")
	public void callBefore()
	{
		System.out.println("Sirjiiiiiiii");
	}
	
	@Before("execution(void com.WelcomeDaoImpl.sayWelcome(..))")
	public void beforeWelcome()
	{
		System.out.println("-------------");
	}
	
	@After("execution(void com.WelcomeDaoImpl.sayWelcome(..))")
	public void bfcalculate()
	{
		System.out.println("\n addition antarra gandu");
	}
	
	@Around("execution(* com.WelcomeDaoImpl.calculate(..))")
	public int arvenky(ProceedingJoinPoint jp)
	{
		System.out.println("in before");
		Object res=null;;
		try {
		 res = 	jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("in after");
		return (int)res;
		
	}
	
}
