package com.example.Student_Service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudentServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceRegistryApplication.class, args);
	}

}
