package com.vinicius.microservices.order_service.domain.model;

import java.time.Instant;
import java.util.UUID;

public class Order {

	private final UUID id;
	private final UUID userId;
	private final Instant createdAt;
	
	public Order(UUID id, UUID userId, Instant createdAt) {
		this.id = id;
		this.userId = userId;
		this.createdAt = createdAt;
	}

	public UUID getId() {
		return id;
	}

	public UUID getUserId() {
		return userId;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}	
}
