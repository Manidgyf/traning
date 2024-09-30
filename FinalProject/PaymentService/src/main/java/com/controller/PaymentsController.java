package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Payments;
import com.service.PaymentsDaoImpl;

@Controller
@RequestMapping("/payments")
public class PaymentsController {

	@Autowired
	PaymentsDaoImpl pdi;
	
	@PostMapping("/confirmPayment")
	@ResponseBody
	Payments confirm(@RequestBody Payments payment)
	{
		return pdi.confirmPayment(payment);
	}
	@GetMapping("/getlist/{ticketId}")
	@ResponseBody
	List<Payments> paylist(@PathVariable Long ticketId)
	{
		return pdi.getPaymentslistbyTicket_id(ticketId);
	}
}
