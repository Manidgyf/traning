package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="hib_emp")
public class Employee {

	@Id
	@GeneratedValue
	private int empid;
	@Column(name="emp_name",nullable=false,length=30)
	private String empname;
	private String empcity;
}
