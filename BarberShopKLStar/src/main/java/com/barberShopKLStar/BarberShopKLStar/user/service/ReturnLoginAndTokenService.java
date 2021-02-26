package com.barberShopKLStar.BarberShopKLStar.user.service;

import com.barberShopKLStar.BarberShopKLStar.user.dto.LoginDTO;
import com.barberShopKLStar.BarberShopKLStar.user.dto.TokenDTO;

@FunctionalInterface
public interface ReturnLoginAndTokenService {
	TokenDTO LoginAndToken(LoginDTO credenciais);
}
