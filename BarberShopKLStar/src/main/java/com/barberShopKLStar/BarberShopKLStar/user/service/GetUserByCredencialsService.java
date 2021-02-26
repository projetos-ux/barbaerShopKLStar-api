package com.barberShopKLStar.BarberShopKLStar.user.service;

import com.barberShopKLStar.BarberShopKLStar.user.dto.LoginDTO;
import com.barberShopKLStar.BarberShopKLStar.user.entity.User;

@FunctionalInterface
public interface GetUserByCredencialsService {
	
	User fetchData(LoginDTO credenciais);

}
