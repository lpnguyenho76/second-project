package com.example.postgre.postgreDemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 8437425390192020214L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
	
	
	public ResourceNotFoundException(String message,Throwable cause) {
		super(message,cause);
	}
	



}
