package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Publisher {

	@Autowired
	private KafkaTemplate<String,Object> template;
	
	public boolean notify(String comment)
	{
		template.send("Blogs", comment);
		
	}
	
}
