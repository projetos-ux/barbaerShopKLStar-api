package com.barberShopKLStar.BarberShopKLStar.user.service;

import org.springframework.security.core.userdetails.UserDetails;

import com.barberShopKLStar.BarberShopKLStar.user.entity.User;

@FunctionalInterface
public interface LoginUserService {
	
	UserDetails authenticate( User user );
	
}
