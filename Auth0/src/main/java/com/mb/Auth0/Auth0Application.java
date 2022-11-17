package com.mb.Auth0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources(value = { @PropertySource("classpath:exceptions.properties"),
							@PropertySource("classpath:message.properties")})
public class Auth0Application {

	public static void main(String[] args) {
		SpringApplication.run(Auth0Application.class, args);
	}

}
