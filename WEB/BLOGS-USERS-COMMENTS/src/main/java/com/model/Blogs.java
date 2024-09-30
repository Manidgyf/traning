package com.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@Table(name = "newBlogs")

public class Blogs {

	@Id
	@GeneratedValue
	private int blogId;
	private String title;
	private String category;
	private String content;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="owner_id")
	@JsonBackReference
	private Owner owner;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "blogs")
	private List<Comments> commentslist = new ArrayList<Comments>();
	
	public Blogs(String title, String category, String content) {
		super();
		this.title = title;
		this.category = category;
		this.content = content;
	}


	
}
