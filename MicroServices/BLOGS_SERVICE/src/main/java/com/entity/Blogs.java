package com.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Blogs {
	@Id
	@GeneratedValue
	private int blogId;
	private String title;
	private String category;
	private String content;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "owner_id")
	private Owner owner;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "blogs")
	private List<Comments> commentsList;

	public Blogs(String title, String category, String content) {
		super();
		this.title = title;
		this.category = category;
		this.content = content;
	}
}
