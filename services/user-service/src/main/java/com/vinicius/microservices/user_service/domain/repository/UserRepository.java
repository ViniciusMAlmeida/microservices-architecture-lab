package com.vinicius.microservices.user_service.domain.repository;

import java.util.Optional;

import com.vinicius.microservices.user_service.domain.model.User;

public interface UserRepository {
	User save(User user);
	Optional<User> findById(Long id);
}
