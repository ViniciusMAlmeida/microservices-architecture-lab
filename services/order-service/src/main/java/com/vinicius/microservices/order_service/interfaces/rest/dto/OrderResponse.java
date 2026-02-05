package com.vinicius.microservices.order_service.interfaces.rest.dto;

import java.time.Instant;
import java.util.UUID;

import com.vinicius.microservices.order_service.domain.model.Order;

public class OrderResponse {

	public UUID id;
	public UUID userId;
	public Instant createdAt;

	public static OrderResponse from(Order order) {
		OrderResponse response = new OrderResponse();

		response.id = order.getId();
		response.userId = order.getUserId();
		response.createdAt = order.getCreatedAt();

		return response;
	}
}
