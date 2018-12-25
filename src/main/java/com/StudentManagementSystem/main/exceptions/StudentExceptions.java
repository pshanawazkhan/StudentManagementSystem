package com.StudentManagementSystem.main.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;


public class StudentExceptions  extends Exception{

	private String message;
	
	public StudentExceptions(String message) {
		
		super(message);
		this.message= message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	
	
}
