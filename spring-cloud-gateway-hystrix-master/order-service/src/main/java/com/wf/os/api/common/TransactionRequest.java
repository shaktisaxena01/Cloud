package com.wf.os.api.common;

import com.wf.os.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

    private Order order;
    /**
	 * 
	 */
	public TransactionRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param order
	 * @param payment
	 */
	public TransactionRequest(Order order, Payment payment) {
		super();
		this.order = order;
		this.payment = payment;
	}
	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}
	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}
	/**
	 * @return the payment
	 */
	public Payment getPayment() {
		return payment;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	private Payment payment;
}
