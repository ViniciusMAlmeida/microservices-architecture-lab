package com.vinicius.microservices.user_service.application.service;

import org.springframework.stereotype.Service;

import com.vinicius.microservices.user_service.domain.model.User;
import com.vinicius.microservices.user_service.domain.repository.UserRepository;
import com.vinicius.microservices.user_service.exception.BusinessException;

@Service
public class FindByIdService {

	private final UserRepository userRepository;

	public FindByIdService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User execute(Long id) {
		return userRepository.findById(id).orElseThrow(() -> new BusinessException("Usuário não encontrado"));
	}
}
