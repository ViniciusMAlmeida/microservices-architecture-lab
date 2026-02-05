package com.vinicius.microservices.order_service.infrastructure.persistence;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class JpaOrderEntity {

	private UUID id;
	private UUID userId;
	private Instant createdAt;

	protected JpaOrderEntity() {
	}

	public JpaOrderEntity(UUID id, UUID userId, Instant createdAt) {
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
