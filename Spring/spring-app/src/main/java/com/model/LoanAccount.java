package com.model;



import lombok.*;

@Data
public class LoanAccount implements InterestCalculator {

	double roi;
	int duration;
	@Override
	public double interestCalculate(double amt) {
		// TODO Auto-generated method stub
		return amt*roi/(duration-1);
	}
	public LoanAccount() {
	System.out.println("onichan");
	}

}
