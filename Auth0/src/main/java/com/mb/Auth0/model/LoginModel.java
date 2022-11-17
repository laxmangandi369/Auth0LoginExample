package com.mb.Auth0.model;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginModel {

	@Valid
	@Email
	private String username;
	
	@NotBlank
	private String password;
}
