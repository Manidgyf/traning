package com.config;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import com.constants.AppConstants;

import ch.qos.logback.classic.Logger;

@Configuration
public class KafkaConfig {

	private Logger logger =(Logger) LoggerFactory.getLogger(KafkaConfig.class);

	@KafkaListener(topics=AppConstants.LOCATION_TOPIC_NAME,groupId = AppConstants.GROUP_ID)
	public void receiveUpdates(String value)
	{
		System.out.println(value);
	}
}
