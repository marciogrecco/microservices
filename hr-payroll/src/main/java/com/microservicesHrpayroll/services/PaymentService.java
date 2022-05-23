package com.microservicesHrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.microservicesHrpayroll.entities.Payments;
import com.microservicesHrpayroll.entities.Worker;
import com.microservicesHrpayroll.feignClients.WorkerFeignClients;

@Service
public class PaymentService {

	@Value("${hr-worker.host}")
	private String workerHost;

	@Autowired
	private WorkerFeignClients workerFeignclients;

	public Payments getPayment(long workerId, int days) {

		Worker worker = workerFeignclients.findById(workerId).getBody();
		return new Payments(worker.getName(), worker.getDailyIncome(), days);
	}
}