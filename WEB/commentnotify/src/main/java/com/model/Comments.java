package com.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

@Table(name = "BlOG_COMMENTS")
public class Comments {


	@Id
	@GeneratedValue
	private int cid;
	private String body;
	public Comments(String body) {
		super();
		this.body = body;
	}
	
}
