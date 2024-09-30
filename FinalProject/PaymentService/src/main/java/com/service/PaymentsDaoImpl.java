package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Payments;
import com.repo.PaymentsRepo;

@Service
public class PaymentsDaoImpl implements PaymentsDao {

	@Autowired
	PaymentsRepo payRepo;

	@Override
	public List<com.entity.Payments> getPaymentslistbyTicket_id(long ticketId) {
		// TODO Auto-generated method stub
		return payRepo.findByTicketId(ticketId);
	}

	@Override
	public Payments confirmPayment(Payments payment) {
		// TODO Auto-generated method stub
		payRepo.save(payment);
		return payRepo.findById(payment.getTransactionId()).get();
	}


}
