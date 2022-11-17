package com.mb.Auth0.model;


import lombok.Data;

@Data
public class SocialLoginTokenRequest {
	
	private String client_id;
	
	private String grant_type;
	
	private String client_secret;
	
	private String redirect_uri;
	
	private String code;
}
