package com.barberShopKLStar.BarberShopKLStar.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
	
	@Id
	private Long id;
	
	@Column(nullable = false,unique = true)
	private String login;
	
	@Column(nullable = false,unique = true)
	private String password;
	
	@Column(unique = true)
	private String email;
	private String fullname;
	private String telefone;
	

}
