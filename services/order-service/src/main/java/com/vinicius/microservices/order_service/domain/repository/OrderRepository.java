package com.vinicius.microservices.order_service.domain.repository;

import java.util.Optional;
import java.util.UUID;

import com.vinicius.microservices.order_service.domain.model.Order;

public interface OrderRepository {

	Order save(Order order);

	Optional<Order> findById(UUID id);
}
