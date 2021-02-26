package com.barberShopKLStar.BarberShopKLStar.user.service;

import org.springframework.stereotype.Service;

import com.barberShopKLStar.BarberShopKLStar.user.dto.LoginDTO;
import com.barberShopKLStar.BarberShopKLStar.user.dto.TokenDTO;
import com.barberShopKLStar.BarberShopKLStar.user.entity.User;
import com.barberShopKLStar.BarberShopKLStar.user.security.JwtService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReturnsLoginAndTokenServiceImpl implements ReturnLoginAndTokenService {
	private final GetUserByCredencialsServiceImpl fetch;
	private final JwtService jwtService;	

	
	
	@Override
	public TokenDTO LoginAndToken(LoginDTO credenciais) {
		User user = fetch.fetchData(credenciais);
        String token = jwtService.generateToken(credenciais);
        return new TokenDTO(user.getLogin(), token);
	}

	
}