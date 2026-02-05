package com.vinicius.microservices.user_service.interfaces.rest.dto;

public class CreateUserRequest {
	private String name;
	private String email;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
