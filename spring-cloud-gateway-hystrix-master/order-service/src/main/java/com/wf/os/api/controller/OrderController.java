package com.wf.os.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.wf.os.api.common.TransactionRequest;
import com.wf.os.api.common.TransactionResponse;
import com.wf.os.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Value("${server.port}")
	private int port;

	@Autowired
	private OrderService service;

	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest request) throws JsonProcessingException {
		return service.saveOrder(request);
	}

	@GetMapping("/testOrder")
	public String testOrder() throws JsonProcessingException {
		System.out.println("Test Order ===============");
		System.out.println("------testOrder----------Printing port In Order Service ------" + port);
		return "Test Order Placed Successfully";

	}

	@GetMapping("/exceptionOrder")
	public void exceptionOrder() throws JsonProcessingException {
		System.out.println("Exception Order ===============");
		System.out.println("------exceptionOrder----------Printing port In Order Service ------" + port);

		try {
			throw new NullPointerException("Exception Order");
		} catch (NullPointerException e) {
			System.out.println("Caught inside Exception Order().");
			throw e; // rethrowing the exception
		}

	}
}
