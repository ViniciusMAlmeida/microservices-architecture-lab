package com.vinicius.microservices.order_service.infrastructure.persistence;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataOrderRepository extends JpaRepository<JpaOrderEntity, UUID> {

}
