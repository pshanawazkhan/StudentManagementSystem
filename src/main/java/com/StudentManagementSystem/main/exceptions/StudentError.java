package com.StudentManagementSystem.main.exceptions;

import org.springframework.http.HttpStatus;

public class StudentError {

	
	
	private int errorCode;
	
	private String errorMessage;

	public StudentError(int errorCode, String errorMessage) {

		this.errorCode =errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
	
	
	
}
