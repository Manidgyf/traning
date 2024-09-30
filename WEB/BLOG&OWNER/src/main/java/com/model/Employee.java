package com.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int eId;
	private String eName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pId")
	private Project project;
	public Employee(String eName) {
		super();
		this.eName = eName;
		this.project = project;
		
	}
	
	
}
