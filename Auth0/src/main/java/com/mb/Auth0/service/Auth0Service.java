package com.mb.Auth0.service;

import com.mb.Auth0.model.AuthLoginResponse;
import com.mb.Auth0.model.LoginModel;
import com.mb.Auth0.model.SocialAuthLoginResponse;
import com.mb.Auth0.model.SocialLoginModel;

public interface Auth0Service {
	
	AuthLoginResponse userLogin(LoginModel loginModel);
	
	SocialAuthLoginResponse userLoginSocial(SocialLoginModel loginModel);
	
}
