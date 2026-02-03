package com.vinicius.microservices.order_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.microservices.order_service.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
