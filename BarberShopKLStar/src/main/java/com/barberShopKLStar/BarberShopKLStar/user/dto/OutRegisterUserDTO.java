package com.barberShopKLStar.BarberShopKLStar.user.dto;

import com.barberShopKLStar.BarberShopKLStar.user.entity.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

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
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_ABSENT)
public class OutRegisterUserDTO {
	
	private long id;
	private String login;
	private String email;
	private String fullName;
	private String telefone;
	
	private User user2;
	
	public OutRegisterUserDTO(User user) {
		this.id = user.getId();
		this.login = user.getLogin();
		this.email = user.getEmail();
		this.fullName = user.getFullname();
		this.telefone = user.getTelefone();
	}
	
	public static OutRegisterUserDTO to(User user) {
		return OutRegisterUserDTO.builder()
		.id(user.getId())
		.login(user.getLogin())
		.email(user.getEmail())
		.fullName(user.getFullname())
		.telefone(user.getTelefone())
		.build();
	}
	
}
