package com.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "owners")
public class Owner {
	@Id
	@GeneratedValue
	private int ownerid;
	private String name;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private List<Blogs> blogList;
	
	public Owner(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
}
