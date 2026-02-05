package com.vinicius.microservices.order_service.interfaces.rest;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.microservices.order_service.application.service.CreateOrderService;
import com.vinicius.microservices.order_service.application.service.FindByIdService;
import com.vinicius.microservices.order_service.domain.model.Order;
import com.vinicius.microservices.order_service.interfaces.rest.dto.OrderResponse;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	private final CreateOrderService createOrderService;
	private final FindByIdService findByIdService;

	public OrderController(CreateOrderService createOrderService, FindByIdService findByIdService) {
		this.createOrderService = createOrderService;
		this.findByIdService = findByIdService;
	}

	@PostMapping
	public ResponseEntity<OrderResponse> create(@RequestParam UUID userId) {
		Order order = createOrderService.execute(userId);
		return ResponseEntity.ok(OrderResponse.from(order));
	}

	@GetMapping
	public ResponseEntity<OrderResponse> findById(@PathVariable UUID id) {
		Order order = findByIdService.execute(id);
		return ResponseEntity.ok(OrderResponse.from(order));
	}
}
