package com.vinicius.microservices.user_service.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.microservices.user_service.domain.model.User;

public interface SpringDataUserRepository extends JpaRepository<User, Long> {

}
