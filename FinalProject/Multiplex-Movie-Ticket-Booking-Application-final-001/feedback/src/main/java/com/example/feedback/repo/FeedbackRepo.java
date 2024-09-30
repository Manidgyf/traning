package com.example.feedback.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.feedback.entity.Feedback;
@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Long> {
	@Query("SELECT f FROM Feedback f WHERE f.usertype = ?1")
	List<Feedback> getFeedbackByUserType(String userType);
	
	
}
