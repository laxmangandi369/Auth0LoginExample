package com.mb.Auth0.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.mb.Auth0.constant.AuthConstant;
import com.mb.Auth0.model.LoginTokenRequest;
@Component
public class BeanConfiguration {
	
	@Autowired
	private Environment env;
	
	@Bean
	public LoginTokenRequest loginTokenRequest()
	{
		LoginTokenRequest accessTokenRequest = new LoginTokenRequest();
		
		accessTokenRequest.setClient_id(env.getProperty(AuthConstant.AUTH0_ID));
		accessTokenRequest.setGrant_type(env.getProperty(AuthConstant.PASSWORD_LOGIN_GRANT_TYPE));
		accessTokenRequest.setAudience(env.getProperty(AuthConstant.AUTH0_AUDIENCE));
		accessTokenRequest.setScope(env.getProperty(AuthConstant.AUTH0_SCOPE));
		accessTokenRequest.setClient_secret(env.getProperty(AuthConstant.AUTH0_SECRET));
		
		return accessTokenRequest;
	}
}
