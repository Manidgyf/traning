package com.example.feedback.service;

import java.util.List;

import com.example.feedback.entity.Feedback;

public interface FeedbackServiceInt {

	void addFeedback(Feedback feedback);
	
	List<Feedback> getAllFeedback();
	List<Feedback> getFeedbackByUserType(String userType);
	String sendAnnouncements(String announcement);
}
