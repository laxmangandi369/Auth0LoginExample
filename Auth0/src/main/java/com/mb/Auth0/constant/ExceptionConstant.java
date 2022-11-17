package com.mb.Auth0.constant;

public class ExceptionConstant {
	
	public ExceptionConstant()
	{
		throw new IllegalStateException("Constant class can't instatiate");
	}
	
	public static final String INTERNAL_SERVER_ERROR = "internal.server.error";
	public static final String INVALID_REQUEST_BODY = "invalid.request.body";
	public static final String INVALID_TOKEN = "invalid.token";
	public static final String BAD_REQUEST = "bad.request";
	public static final String INVALID_REQUEST = "invalid.request";
	
	public static final String WRONG_EMAIL_OR_PSWD = "wrong.email.or.password";
	public static final String WRONG_CODE ="wrong.code";
	
	public static final String USER_NOT_FOUND = "user.not.found";

}
