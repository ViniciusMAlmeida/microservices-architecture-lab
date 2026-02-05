package com.vinicius.microservices.order_service.infrastructure.persistence;

import java.util.Optional;
import java.util.UUID;

import com.vinicius.microservices.order_service.domain.model.Order;
import com.vinicius.microservices.order_service.domain.repository.OrderRepository;

public class JpaOrderRepository implements OrderRepository {

	private final SpringDataOrderRepository springRepository;

	public JpaOrderRepository(SpringDataOrderRepository springRepository) {
		this.springRepository = springRepository;
	}

	@Override
	public Order save(Order order) {
		JpaOrderEntity entity = new JpaOrderEntity(order.getId(), order.getUserId(), order.getCreatedAt());

		JpaOrderEntity saved = springRepository.save(entity);

		return new Order(saved.getId(), saved.getUserId(), saved.getCreatedAt());
	}

	@Override
	public Optional<Order> findById(UUID id) {
		return springRepository.findById(id).map(e -> new Order(e.getId(), e.getUserId(), e.getCreatedAt()));
	}

}
