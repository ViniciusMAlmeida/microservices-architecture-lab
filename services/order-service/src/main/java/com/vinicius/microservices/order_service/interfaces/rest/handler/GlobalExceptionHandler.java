package com.vinicius.microservices.order_service.interfaces.rest.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vinicius.microservices.order_service.domain.exception.OrderNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<String> handleOrderNotFound(OrderNotFoundException e) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
	}
}
