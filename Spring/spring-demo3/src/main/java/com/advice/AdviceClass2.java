package com.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AdviceClass2 {


	@Before("execution(* com.WelcomeDaoImpl.sayHello(..))")
	public void callBefore()
	{
		System.out.println("hello");
	}
}
