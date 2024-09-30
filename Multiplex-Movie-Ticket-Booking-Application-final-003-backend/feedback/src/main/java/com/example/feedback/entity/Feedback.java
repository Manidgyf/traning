package com.example.feedback.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Feedback {
	
	@Id
	@GeneratedValue
	private long feedbackId;
	private String feedbackTitle;
	private String feedbackBody;
	private String usertype;
	
	
}
