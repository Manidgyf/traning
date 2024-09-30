package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payments {
	@Id
	private long transactionId;
	private String upiId;
	private long ticketId;
	private String captcha;
	//private boolean status;
}
