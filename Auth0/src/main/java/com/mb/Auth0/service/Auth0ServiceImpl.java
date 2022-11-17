package com.mb.Auth0.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.mb.Auth0.constant.ExceptionConstant;
import com.mb.Auth0.endpoint.AuthEndPoint;
import com.mb.Auth0.exception.CustomException;
import com.mb.Auth0.model.AuthLoginResponse;
import com.mb.Auth0.model.LoginModel;
import com.mb.Auth0.model.SocialAuthLoginResponse;
import com.mb.Auth0.model.SocialLoginModel;

@Service
public class Auth0ServiceImpl implements Auth0Service {

	@Autowired
	private AuthEndPoint authEndPoint;

	@Override
	public AuthLoginResponse userLogin(LoginModel loginModel) {

		AuthLoginResponse loginResponse = null;
		try {
			loginResponse = authEndPoint.loginUser(loginModel.getUsername(), loginModel.getPassword());
		} catch (Exception ex) {
			throw new CustomException(ExceptionConstant.USER_NOT_FOUND, HttpStatus.NOT_FOUND.value());
		}
		return loginResponse;
	}

	@Override
	public SocialAuthLoginResponse userLoginSocial(SocialLoginModel loginModel) {

		SocialAuthLoginResponse loginResponse = null;
		try {
			loginResponse = authEndPoint.loginUserSocial(loginModel.getCode());
		} catch (Exception ex) {
			throw new CustomException(ExceptionConstant.BAD_REQUEST, HttpStatus.BAD_REQUEST.value());
		}

		return loginResponse;
	}

}
