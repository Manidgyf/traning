package com.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Comments {

	@Id
	@GeneratedValue
	private int cId;
	private String cBody;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="blog_id")
	private Blogs blogs;
	public Comments(String cBody) {
		super();
		this.cBody = cBody;
	}

}
