package com.microservicesHrpayroll.services;

import org.springframework.stereotype.Service;

import com.microservicesHrpayroll.entities.Payments;

@Service
public class PaymentServices {

	public Payments getPayment(long workerId, int days) {
		return new Payments("Bob", 200.0, days);
	}
}