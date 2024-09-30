package com.example.feedback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.feedback.entity.Feedback;
import com.example.feedback.repo.FeedbackRepo;

@Service
public class FeedbackService implements FeedbackServiceInt {
	@Autowired
		private KafkaTemplate<String, String> template;
	@Autowired
	FeedbackRepo feedbackRepo;

	@Override
	public List<Feedback> getAllFeedback() {
		
		return feedbackRepo.findAll();
		
	}

	@Override
	public List<Feedback> getFeedbackByUserType(String userType) {
		
		return feedbackRepo.getFeedbackByUserType(userType);
	}

	@Override
	public void addFeedback(Feedback feedback) {
		feedbackRepo.save(feedback);
		
	}

	@Override
	public String sendAnnouncements(String announcement) {
		template.send("announcement",announcement);
		return "announced!!";
	}
	

}
