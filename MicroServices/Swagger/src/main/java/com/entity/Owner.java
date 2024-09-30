package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.*;
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
