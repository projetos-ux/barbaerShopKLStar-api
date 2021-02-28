package com.barberShopKLStar.BarberShopKLStar.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserDoesNotExistException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public UserDoesNotExistException(String msg) {
		super(msg);
	}
	public UserDoesNotExistException() {
		super();
	}
	
	

}
