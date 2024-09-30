package com.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.*;

@Data
@Configuration
@ConfigurationProperties("spring.datasource")

public class ProfConfig {

	private String driverClassName;
	private String url;
	private String username;
	private String password;
	
	@Bean
	@Profile("dev")
	public String testdevDB()
	{
		System.out.println(driverClassName);
		System.out.println(url);
		return "dev connect";
	}
	@Bean
	@Profile("prod")
	public String testprodDB()
	{
		System.out.println(driverClassName);
		System.out.println(url);
		return "prod connetected";
	}	@Bean
	@Profile("test")
	public String testTestDB()
	{
		System.out.println(driverClassName);
		System.out.println(url);
		return "test connected";
	}
}
