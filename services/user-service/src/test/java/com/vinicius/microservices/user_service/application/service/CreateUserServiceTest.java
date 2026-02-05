package com.vinicius.microservices.user_service.application.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;


import com.vinicius.microservices.user_service.domain.model.User;
import com.vinicius.microservices.user_service.domain.repository.UserRepository;

class CreateUserServiceTest {

    private UserRepository repository;
    private CreateUserService service;

    @BeforeEach
    void setup() {
        repository = Mockito.mock(UserRepository.class);
        service = new CreateUserService(repository);
    }

    @Test
    void shouldCreateUserSuccessfully() {
        User user = new User("Vinicius", "vinicius@email.com");
        Mockito.when(repository.save(any())).thenReturn(user);

        User result = service.execute("Vinicius", "vinicius@email.com");

        assertEquals("Vinicius", result.getName());
    }
}