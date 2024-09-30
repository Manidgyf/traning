package com.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@Entity
@Table(name = "newOwner")
public class Owner {

	@Id
	@GeneratedValue
	private int ownerId;
	private String name;
	private String email;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "owner")
	@JsonBackReference
	private List<Blogs> bloglist = new ArrayList<Blogs>();
	public Owner(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	

	
}
