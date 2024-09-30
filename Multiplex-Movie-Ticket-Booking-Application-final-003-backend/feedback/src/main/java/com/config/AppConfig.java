package com.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

public class AppConfig {
	//Kafka Creating topic
	@Bean
	public NewTopic topic() {
		return TopicBuilder.name("announcement").build();
	}

}
