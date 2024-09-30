package com.model;

import lombok.*;

@AllArgsConstructor
public class SavingsAcc implements InterestCalculator {

	double roi;
	int duration;
	@Override
	public double interestCalculate(double amt) {
		
		return amt*roi/duration;
	}


}
