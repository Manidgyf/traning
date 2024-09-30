package com.example.Student_Service_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EnableDiscoveryClient
public class StudentServiceMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceMsApplication.class, args);
	}

}
