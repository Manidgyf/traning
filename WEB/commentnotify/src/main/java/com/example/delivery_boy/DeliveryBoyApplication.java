package com.example.delivery_boy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.kafka.annotation.EnableKafka;

import jakarta.persistence.Entity;

@ComponentScan("com")
@SpringBootApplication
@EnableJpaRepositories("com")
@EnableKafka
@EntityScan("com")

public class DeliveryBoyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryBoyApplication.class, args);
	}

}
