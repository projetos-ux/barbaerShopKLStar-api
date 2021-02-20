package com.barberShopKLStar.BarberShopKLStar.user.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.barberShopKLStar.BarberShopKLStar.user.dto.RegisterUserDTO;

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
@Entity
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
	@SequenceGenerator(name = "user_generator", sequenceName = "user_sequence", allocationSize = 1)
	@Id
	private Long id;
	
	@Column(nullable = false,unique = true)
	@NotBlank(message = "login field is mandatory")
	private String login;
	
	@Column(nullable = false,unique = true)
	@NotBlank(message = "password field is mandatory")
	private String password;
	
	@Column(unique = true)
	@Email(message = "field email invalid")
	private String email;
	@Length(min = 4, max = 150)
	private String fullname;
	private String telefone;
	
	//public static User to(RegisterUserDTO dto) {
		//return User;
		
	//}

}
