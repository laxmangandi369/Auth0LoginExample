package com.mb.Auth0.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SocialAuthLoginResponse {
	
	private String access_token;
	
	private String refresh_token;
	
	private String id_token;
	
	private String expires_in;
	
	private String token_type;
}
