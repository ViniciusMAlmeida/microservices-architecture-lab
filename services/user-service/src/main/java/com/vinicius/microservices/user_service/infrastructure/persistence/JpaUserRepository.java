package com.vinicius.microservices.user_service.infrastructure.persistence;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.vinicius.microservices.user_service.domain.model.User;
import com.vinicius.microservices.user_service.domain.repository.UserRepository;

@Repository
public class JpaUserRepository implements UserRepository {

	private final SpringDataUserRepository repository;

	public JpaUserRepository(SpringDataUserRepository repository) {
		this.repository = repository;
	}

	@Override
	public User save(User user) {
		return repository.save(user);
	}

	@Override
	public Optional<User> findById(Long id) {
		return repository.findById(id);
	}

}
