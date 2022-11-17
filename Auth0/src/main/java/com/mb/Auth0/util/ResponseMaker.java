package com.mb.Auth0.util;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.mb.Auth0.model.ErrorResponse;
import com.mb.Auth0.model.SuccessResponse;


@Component
public class ResponseMaker {

	private Logger logger = LogManager.getLogger();

	public <T> ResponseEntity<SuccessResponse<T>> successResponse(String message, T data) {

		SuccessResponse<T> response = new SuccessResponse<>(message, HttpStatus.OK.value(), data, false, new Date());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	public ResponseEntity<ErrorResponse> errorResponse(String message, Integer errorCode) {

		ErrorResponse response = new ErrorResponse(message, errorCode, true, new Date());

		logger.error(response);
		return new ResponseEntity<>(response, HttpStatus.valueOf(errorCode));
	}


}
