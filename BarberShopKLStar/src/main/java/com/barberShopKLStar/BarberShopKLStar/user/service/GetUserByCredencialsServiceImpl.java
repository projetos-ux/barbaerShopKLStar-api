package com.barberShopKLStar.BarberShopKLStar.user.service;

import org.springframework.stereotype.Service;

import com.barberShopKLStar.BarberShopKLStar.user.dto.LoginDTO;
import com.barberShopKLStar.BarberShopKLStar.user.entity.User;

import lombok.RequiredArgsConstructor;

//@RequiredArgsConstructor
@Service
public class GetUserByCredencialsServiceImpl implements GetUserByCredencialsService{
	
	
	//private final LoginUserServiceImpl login;
	
	public User fetchData(LoginDTO credenciais) {
		User user = User.builder().login(credenciais.getLogin()).password(credenciais.getPassword()).build();				
       // UserDetails authenticateUser = login.authenticate(user);
        return user;
	}

}
