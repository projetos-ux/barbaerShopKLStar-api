package com.barberShopKLStar.BarberShopKLStar.user.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.barberShopKLStar.BarberShopKLStar.user.dto.LoginDTO;
import com.barberShopKLStar.BarberShopKLStar.user.dto.OutRegisterUserDTO;
import com.barberShopKLStar.BarberShopKLStar.user.dto.RegisterUserDTO;
import com.barberShopKLStar.BarberShopKLStar.user.dto.TokenDTO;
import com.barberShopKLStar.BarberShopKLStar.user.service.RegisterUserServiceImpl;
import com.barberShopKLStar.BarberShopKLStar.user.service.ReturnLoginAndTokenService;
import com.google.common.net.MediaType;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/klstar/")
@CrossOrigin("*")
public class UserController {
	
	private final RegisterUserServiceImpl registerImpl;	
	
	private final ReturnLoginAndTokenService authenticationReturn;
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping(value = "/register")
	public OutRegisterUserDTO registerUser(@Valid @RequestBody RegisterUserDTO user) {
		return registerImpl.save(user);
		
	}
	
	@PostMapping(value = "/auth")
	@ResponseStatus(HttpStatus.ACCEPTED)
    public TokenDTO authenticate(@Valid  @RequestBody LoginDTO credenciais){
		return authenticationReturn.LoginAndToken(credenciais);
        
    }
}
