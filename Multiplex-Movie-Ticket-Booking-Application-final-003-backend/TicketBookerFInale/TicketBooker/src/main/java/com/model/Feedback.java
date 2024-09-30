package com.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Feedback {
	
	private String feedbackTitle;
	private String feedbackBody;
	private String usertype;
	
}
