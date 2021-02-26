package com.barberShopKLStar.BarberShopKLStar.user.service;


import javax.transaction.Transactional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.barberShopKLStar.BarberShopKLStar.user.dto.OutRegisterUserDTO;
import com.barberShopKLStar.BarberShopKLStar.user.dto.RegisterUserDTO;
import com.barberShopKLStar.BarberShopKLStar.user.entity.User;
import com.barberShopKLStar.BarberShopKLStar.user.exception.InvalidDataException;
import com.barberShopKLStar.BarberShopKLStar.user.exception.UserAlreadyExistsException;
import com.barberShopKLStar.BarberShopKLStar.user.jpa.UserRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class RegisterUserServiceImpl implements RegisterUserService {
	
	private final UserRepository userBD;
	private final PasswordEncoder passwordEncoder;
	


	
	@Transactional
	public OutRegisterUserDTO save(RegisterUserDTO user) {	
		
		if(userBD.existsByLogin(user.getLogin())==true){
			throw new UserAlreadyExistsException();	
		}
		if(userBD.existsByEmail(user.getEmail())==true) {
			throw new UserAlreadyExistsException();
		}
		if(user.getLogin().matches("[a-zA-Z.]*")) {
			String EncryptedPassword = passwordEncoder.encode(user.getPassword());
			user.setPassword(EncryptedPassword);
			User userImpl = User.to(user);
			userBD.save(userImpl);
		
		
		return new OutRegisterUserDTO(userImpl);
		}
		
		else {
			throw new InvalidDataException();
		}
	}
	
}
