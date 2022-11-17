package com.mb.Auth0.model;

import lombok.Data;

@Data
public class LoginTokenRequest {

	private String username;
	
	private String password;
	
	private String client_id;
	
	private String client_secret;

	private String grant_type;
	
	private String audience;
	
	private String scope;
}
