package com.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Comments {
	@Id
	@GeneratedValue
	int commentID;
	String commenter;
	String comment;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "blogId")
	private Blogs blogs;

	public Comments(String commenter, String comment) {
		super();
		this.commenter = commenter;
		this.comment = comment;
	}

}
