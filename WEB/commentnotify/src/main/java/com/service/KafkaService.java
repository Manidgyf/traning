package com.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.config.AppConstants;
import com.model.Comments;

import ch.qos.logback.classic.Logger;

@Service
public class KafkaService {
	
	@Autowired
	CommentRepo cr;
	@Autowired
	private KafkaTemplate<String,String> template;
	
	private Logger logger =(Logger) LoggerFactory.getLogger(KafkaService.class);
	
	public boolean notify(String comment)
	{
		template.send(AppConstants.LOCATION_TOPIC_NAME,comment);
		return true;
	}
	public void addComment(Comments cmt)
	{
		cr.save(cmt);
	}

}
