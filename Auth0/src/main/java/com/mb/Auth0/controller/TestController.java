package com.mb.Auth0.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping
	public String testAccessToken(@RequestParam String token)
	{
		return "read: UserServiceBeanDefinitionParser permission";
	}
	
	@GetMapping("/grant")
	public String test2AccessToken(@RequestParam String token)
	{
		return "create:client_grants permission";
	}

}
