package com.service;

import java.util.List;

import com.entity.Payments;



public interface PaymentsDao {
	
	//Payments createPayment(long ticketId);
	
	List<Payments> getPaymentslistbyTicket_id(long ticketId);
	Payments confirmPayment(Payments payment);
	
}
