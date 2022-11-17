package com.mb.Auth0.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ValidatioErrorResponse {

	private String fieldName;
	
	private String message;
	
}
