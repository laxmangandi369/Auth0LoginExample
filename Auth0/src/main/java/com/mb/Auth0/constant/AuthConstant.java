package com.mb.Auth0.constant;

public class AuthConstant {

	private AuthConstant() {
		throw new IllegalStateException("Constant class.can't instatiate");
	}
	
	public static final String AUTH_DOMAIN = "auth0.domain";
	public static final String AUTH0_ID = "auth0.client.id";
	public static final String AUTH0_SECRET = "auth0.client.secret";
	public static final String AUTH0_AUDIENCE = "auth0.audience";
	public static final String AUTH0_SCOPE = "auth0.scope";
	public static final String AUTH0_REFERESH_TOKEN_SCOPE = "auth0.referesh.token.scope";
	public static final String ACCESS_TOKEN_GRANT_TYPE = "access.token.grant.type";
	public static final String PASSWORD_LOGIN_GRANT_TYPE = "password.login.grant.type";
	public static final String AUTH0_REDIRECT_URI = "auth0.redirect.uri";
	public static final String AUTH0_OAUTH_TOKEN_URL= "auth0.oauth.token.url";
	
	
	public static final String ACCEPT = "Accept";
	public static final String CONTENT_TYPE = "Content-type";
}
