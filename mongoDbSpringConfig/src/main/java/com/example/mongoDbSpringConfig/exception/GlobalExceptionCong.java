package com.example.mongoDbSpringConfig.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionCong {
//
//	@ExceptionHandler(UserNotFound.class)
//	public ResponseEntity<String> handleUserNotFound(UserNotFound ex) {
//
//		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
//	}

	@ExceptionHandler(ProductNotFound.class)
	public ResponseEntity<String> handleProductNotFound(ProductNotFound obj) {

		return new ResponseEntity<>("HANDLED:"+obj.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAnyException(Exception obj) {

		return new ResponseEntity<>("EXCEPTION"+obj.getMessage(), HttpStatus.NOT_FOUND);
	}

}
  
	    