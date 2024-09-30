package com.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Insurance {

	private int empId;
	private String scheme;
	private int amount;
	
}
