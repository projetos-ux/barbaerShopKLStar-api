package com.barberShopKLStar.BarberShopKLStar.user.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.barberShopKLStar.BarberShopKLStar.user.dto.OutRegisterUserDTO;
import com.barberShopKLStar.BarberShopKLStar.user.dto.RegisterUserDTO;
import com.barberShopKLStar.BarberShopKLStar.user.entity.User;
import com.barberShopKLStar.BarberShopKLStar.user.exception.IncorrectUserOrPasswordException;
import com.barberShopKLStar.BarberShopKLStar.user.exception.InvalidDataException;
import com.barberShopKLStar.BarberShopKLStar.user.exception.LoginNotFoundException;
import com.barberShopKLStar.BarberShopKLStar.user.exception.UserAlreadyExistsException;
import com.barberShopKLStar.BarberShopKLStar.user.exception.UserDoesNotExistException;
import com.barberShopKLStar.BarberShopKLStar.user.jpa.UserRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class LoginUserServiceImpl implements LoginUserService {
	
	private final PasswordEncoder encoder;
	private final UserRepository userBD;
	private final LoadByUsernameService load;
	
	public UserDetails authenticate(User user) {
		
		UserDetails userDetails = load.loadUserByUsername(user.getLogin());
		
		if(userDetails.getUsername() == null) {
			throw new LoginNotFoundException();
		}
		userBD.findByLogin(user.getLogin()).orElseThrow(() -> new UserDoesNotExistException());
		boolean PasswordsMatch = encoder.matches(user.getPassword(), userDetails.getPassword());
		
		if(PasswordsMatch) {
			return userDetails;
		}else {
			throw new IncorrectUserOrPasswordException();
		}
			
		
	}
	
	
	
	
	
	

}
