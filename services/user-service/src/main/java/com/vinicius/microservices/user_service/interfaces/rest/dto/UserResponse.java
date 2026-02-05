package com.vinicius.microservices.user_service.interfaces.rest.dto;

import com.vinicius.microservices.user_service.domain.model.User;

public class UserResponse {

	private Long id;
	private String name;
	private String email;

	public UserResponse(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public static UserResponse from(User user) {
		return new UserResponse(user.getId(), user.getName(), user.getEmail());
	}
}
