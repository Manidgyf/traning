package com.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor

@Entity
public class Project {

	@Id
	@GeneratedValue
	private int pId;
	private String pName;
	@OneToMany
	@JoinColumn(name="joining-data")
	private List<Employee> usrs;
	public Project(String pName,List<Employee> lst) {
		this.pName = pName;
		this.usrs=lst;
	}
	
	

	
}
