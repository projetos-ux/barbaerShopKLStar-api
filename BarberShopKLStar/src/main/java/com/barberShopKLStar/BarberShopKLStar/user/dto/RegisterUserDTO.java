package com.barberShopKLStar.BarberShopKLStar.user.dto;

import javax.validation.constraints.Email;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

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
public class RegisterUserDTO {
	@NotBlank(message = "field.login.mandatory")
	private String login;
	@NotBlank(message = "field.password.mandatory")
	private String password;
	@Email(message = "field.emil.invalid")
	private String email;
	@Length(min = 4, max = 150)
	private String fullName;
	
	private String telefone;
}
