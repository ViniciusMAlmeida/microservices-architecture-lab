package com.vinicius.microservices.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.microservices.user_service.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
