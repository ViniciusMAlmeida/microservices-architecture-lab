package com.vinicius.microservices.order_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.microservices.order_service.client.UserClient;
import com.vinicius.microservices.order_service.domain.Order;
import com.vinicius.microservices.order_service.repository.OrderRepository;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	private final OrderRepository repository;
	private final UserClient userClient;
	
	public OrderController(OrderRepository repository, UserClient userClient) {
		this.repository = repository;
		this.userClient = userClient;
	}
	
	@PostMapping
	public Order create(@RequestBody Order order) {
		userClient.validateUser(order.getUserId());
		return repository.save(order);
	}
}
