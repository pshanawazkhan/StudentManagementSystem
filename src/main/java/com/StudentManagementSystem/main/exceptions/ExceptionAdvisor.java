package com.StudentManagementSystem.main.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvisor {

	
	
	
	@ExceptionHandler({StudentExceptions.class})
	public ResponseEntity<StudentError> mapStudentException(StudentExceptions sexp){
		
		System.out.println("ExceptionAdvisor class ------------------>");
		StudentError se = new StudentError(HttpStatus.INTERNAL_SERVER_ERROR.value(),sexp.getMessage());
		
		return  new ResponseEntity<StudentError>(se,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
	
	
	
}
