package com.vinicius.microservices.user_service.interfaces.rest.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vinicius.microservices.user_service.exception.BusinessException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<?> handle(BusinessException e) {
		return ResponseEntity.badRequest().body(e.getMessage());
	}
}
