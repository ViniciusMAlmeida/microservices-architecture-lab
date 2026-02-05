package com.vinicius.microservices.user_service.application.service;

import org.springframework.stereotype.Service;

import com.vinicius.microservices.user_service.domain.model.User;
import com.vinicius.microservices.user_service.domain.repository.UserRepository;

@Service
public class CreateUserService {

	private final UserRepository repository;

	public CreateUserService(UserRepository repository) {
		this.repository = repository;
	}

	public User execute(String name, String email) {
		User user = new User(name, email);
		return repository.save(user);
	}
}
