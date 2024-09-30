package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties("spring.datasource")
public class AppConfig {
	private String driverClassName;
	private String url;
	private String username;
	private String password;


	@Bean
	@Profile("dev")
	public String testProdDB() {
		System.out.println(driverClassName);
		System.out.println(url);
		
		return "DEV DB connected...";
	} 
	@Bean
	@Profile("test")
	public String testTestDB() {
		System.out.println(driverClassName);
		System.out.println(url);
		
		return "TEST DB connected...";
	} 
}
