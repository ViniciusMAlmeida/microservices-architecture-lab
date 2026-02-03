package com.vinicius.microservices.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.microservices.user_service.domain.User;
import com.vinicius.microservices.user_service.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	private final UserRepository repository;

	public UserController(UserRepository repository) {
		this.repository = repository;
	}

	@PostMapping
	public User create(@RequestBody User user) {
		return repository.save(user);
	}

	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
	}
}
