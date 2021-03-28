package com.wf.ps.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.wf.ps.api.entity.Payment;
import com.wf.ps.api.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Value("${server.port}")
	private int port;
	
    @Autowired
    private PaymentService service;

    @PostMapping("/doPayment")
	public Payment doPayment(@RequestBody Payment payment) throws JsonProcessingException {
		System.out.println("------doPayment----------Printing port in Payment Service------"+port);
		return service.doPayment(payment);
	}

	@GetMapping("/{orderId}")
	public Payment findPaymentHistoryByOrderId(@PathVariable int orderId) throws JsonProcessingException {
		System.out.println("-------findPaymentHistoryByOrderId---------Printing port in Payment Service------"+port);
		return service.findPaymentHistoryByOrderId(orderId);
	}


}
