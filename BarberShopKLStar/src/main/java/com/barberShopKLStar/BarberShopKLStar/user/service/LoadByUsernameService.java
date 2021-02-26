package com.barberShopKLStar.BarberShopKLStar.user.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.barberShopKLStar.BarberShopKLStar.user.entity.User;
import com.barberShopKLStar.BarberShopKLStar.user.exception.IncorrectUserOrPasswordException;
import com.barberShopKLStar.BarberShopKLStar.user.jpa.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class LoadByUsernameService implements UserDetailsService {
	
	private final UserRepository userBD;

	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		User user = userBD.findByLogin(login).orElseThrow(() -> new IncorrectUserOrPasswordException());
		return org.springframework.security.core.userdetails.
				User.builder().username(user.getLogin())
				.password(user.getPassword()).roles("USER").build();
	}
}