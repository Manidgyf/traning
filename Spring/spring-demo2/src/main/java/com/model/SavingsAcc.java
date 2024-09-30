package com.model;

import lombok.*;

@Data
public class SavingsAcc implements InterestCalculator {

	double roi;
	int duration;
	@Override
	public double interestCalculate(double amt) {
		
		return amt*roi/duration;
	}
	public SavingsAcc() {
		System.out.println("nandayo");
	}

}
