package com.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor

public class SalaryAccount implements InterestCalculator {

	double roi;
		int duration;
		@Override
		public double interestCalculate(double amt) {
			// TODO Auto-generated method stub
			System.out.println("in sal acc");
			return amt*duration*roi;
			
		}

}
