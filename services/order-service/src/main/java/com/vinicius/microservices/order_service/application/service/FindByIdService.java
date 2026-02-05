package com.vinicius.microservices.order_service.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.vinicius.microservices.order_service.domain.exception.OrderNotFoundException;
import com.vinicius.microservices.order_service.domain.model.Order;
import com.vinicius.microservices.order_service.domain.repository.OrderRepository;

@Service
public class FindByIdService {

	private final OrderRepository orderRepository;

	public FindByIdService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public Order execute(UUID id) {
		return orderRepository.findById(id).orElseThrow(() -> new OrderNotFoundException(id));
	}
}
