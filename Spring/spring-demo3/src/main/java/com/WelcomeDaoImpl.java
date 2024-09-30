package com;

public class WelcomeDaoImpl implements WelcomeDao {

	@Override
	public String sayHello(String str) {
		// TODO Auto-generated method stub
		return "WELCOME "+str;
	}

	@Override
	public void sayWelcome() {
		// TODO Auto-generated method stub
		System.out.println( "jilelamma jitta pilla paala pitta");
		
	}

	@Override
	public int calculate(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("in calculate");
		return a+b;
	}

	@Override
	public void venky() {
		System.out.println("mafiliya");
		
	}

}
