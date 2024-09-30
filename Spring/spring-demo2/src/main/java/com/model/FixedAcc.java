package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.*;
@Data
@Component(value = "fda")
//@Lazy
public class FixedAcc implements InterestCalculator {

	@Value("6.9")
	double roi;
	@Value("5")
	int duration;
	
	
	@Override
	public double interestCalculate(double amt) {
		
		return amt*roi/duration;
	}


	public FixedAcc() {
		System.out.println("hola");
	}

	
}
