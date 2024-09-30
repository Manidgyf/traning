package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name="hib_emp1")
public class Employee {

	@Id
	private int empId;
	private String empName;
	private String empCity;
	
}
