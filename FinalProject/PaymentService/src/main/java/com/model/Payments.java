package com.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
//@Component
public class Payments {
	@Id
	private Long transactionId;
	private Long ticket_id;
	private String upiId;
	private String captcha;
}
