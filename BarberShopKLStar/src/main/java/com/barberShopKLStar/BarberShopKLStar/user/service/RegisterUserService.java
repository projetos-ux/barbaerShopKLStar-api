package com.barberShopKLStar.BarberShopKLStar.user.service;

import com.barberShopKLStar.BarberShopKLStar.user.dto.OutRegisterUserDTO;
import com.barberShopKLStar.BarberShopKLStar.user.dto.RegisterUserDTO;

@FunctionalInterface
public interface RegisterUserService {
	OutRegisterUserDTO save(RegisterUserDTO user);
}
