package com.barberShopKLStar.BarberShopKLStar.user.dto;

import com.barberShopKLStar.BarberShopKLStar.user.entity.User;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor	
@NoArgsConstructor
@Builder
public class OutRegisterUserDTO {
	
	private long id;
	private String login;
	private String email;
	private String fullName;
	
	private User user2;
	
	//public OutRegisterDTO(User user) {
		//this.id = user.
	//}
}
