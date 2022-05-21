package com.microservicesHrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicesHrpayroll.entities.Payments;
import com.microservicesHrpayroll.services.PaymentServices;

@RestController
@RequestMapping(value = "/payments")
public class PaymentsResources {

	@Autowired
	private PaymentServices service;

	@GetMapping(value = "/{workerId}/days/{days}")
	public ResponseEntity<Payments> getPayment(@PathVariable Long workerId, @PathVariable Integer days) {
		Payments payment = service.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}	
}