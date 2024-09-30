package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.*;
//@Data
//@Component(value = "fda")
//@Lazy

@AllArgsConstructor
public class FixedAcc implements InterestCalculator {

	
	double roi;

	int duration;
	
	
	@Override
	public double interestCalculate(double amt) {
		
		return amt*roi/duration;
	}


	public FixedAcc() {
		System.out.println("hola");
	}

	
}
