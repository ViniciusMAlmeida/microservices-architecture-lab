package com.vinicius.microservices.order_service.domain.exception;

import java.util.UUID;

public class OrderNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public OrderNotFoundException(UUID id) {
		super("Order not found with id: " + id);
	}
}
