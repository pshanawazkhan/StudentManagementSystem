package com.StudentManagementSystem.main;

import org.aspectj.weaver.ast.ITestVisitor;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

	
	
	public Test getTest() {
		
		Test t1 = new Test();
		
		return t1;
	}
	
	
	
	
}
