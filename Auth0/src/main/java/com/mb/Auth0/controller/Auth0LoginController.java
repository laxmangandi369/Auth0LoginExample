package com.mb.Auth0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mb.Auth0.model.AuthLoginResponse;
import com.mb.Auth0.model.LoginModel;
import com.mb.Auth0.model.SocialAuthLoginResponse;
import com.mb.Auth0.model.SocialLoginModel;
import com.mb.Auth0.model.SuccessResponse;
import com.mb.Auth0.service.Auth0Service;
import com.mb.Auth0.util.ResponseMaker;
import com.mb.Auth0.constant.ResponseConstant;


import javax.validation.Valid;


@RestController
@RequestMapping("/login")
public class Auth0LoginController {

	@Autowired
	private Environment env;

	@Autowired
	private ResponseMaker responseMaker;

	@Autowired
	private Auth0Service auth0Service;
	

	@PostMapping
	public ResponseEntity<SuccessResponse<AuthLoginResponse>> loginUser(@RequestBody @Valid LoginModel loginModel) {
		AuthLoginResponse loginResponse = auth0Service.userLogin(loginModel);

		return responseMaker.successResponse(env.getProperty(ResponseConstant.SUCCESS), loginResponse);
	}

	@PostMapping(value = "/social")
	public ResponseEntity<SuccessResponse<SocialAuthLoginResponse>> loginUserSocial(
			@RequestBody @Valid SocialLoginModel loginModel) {
		SocialAuthLoginResponse loginResponse = auth0Service.userLoginSocial(loginModel);

		return responseMaker.successResponse(env.getProperty(ResponseConstant.SUCCESS), loginResponse);
	}

}
