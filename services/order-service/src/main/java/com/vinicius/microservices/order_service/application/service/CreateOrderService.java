package com.vinicius.microservices.order_service.application.service;

import java.time.Instant;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.vinicius.microservices.order_service.domain.model.Order;
import com.vinicius.microservices.order_service.domain.repository.OrderRepository;

@Service
public class CreateOrderService {

	private final OrderRepository orderRepository;

	public CreateOrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public Order execute(UUID userId) {
		Order order = new Order(UUID.randomUUID(), userId, Instant.now());
		return orderRepository.save(order);
	}
}
