package com.vinicius.microservices.order_service.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserClient {

	private final RestTemplate restTemplate = new RestTemplate();

	public void validateUser(Long userId) {
		String url = "http://localhost:8081/users/" + userId;

		try {
			restTemplate.getForObject(url, Object.class);
		} catch (Exception e) {
			throw new RuntimeException("Invalid user");
		}
	}
}
