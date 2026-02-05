package com.vinicius.microservices.user_service.interfaces.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinicius.microservices.user_service.application.service.CreateUserService;
import com.vinicius.microservices.user_service.application.service.FindByIdService;
import com.vinicius.microservices.user_service.domain.model.User;
import com.vinicius.microservices.user_service.interfaces.rest.dto.CreateUserRequest;
import com.vinicius.microservices.user_service.interfaces.rest.dto.UserResponse;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	private final CreateUserService createUserService;
	private final FindByIdService findByIdService;

	public UserController(CreateUserService createUserService, FindByIdService findByIdService) {
		this.createUserService = createUserService;
		this.findByIdService = findByIdService;
	}

	@PostMapping
	public ResponseEntity<UserResponse> create(@RequestBody CreateUserRequest request) {

		User user = createUserService.execute(request.getName(), request.getEmail());

		return ResponseEntity.ok(UserResponse.from(user));
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<UserResponse> findById(@PathVariable Long id) {

		User user = findByIdService.execute(id);

		return ResponseEntity.ok(UserResponse.from(user));
	}
}
