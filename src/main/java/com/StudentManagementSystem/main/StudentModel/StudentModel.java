package com.StudentManagementSystem.main.StudentModel;

public class StudentModel {

	
	
	
	private String name;
	
	private String email;
	
	private String place;
	
	private String phone;
	
	public StudentModel() {}

	public StudentModel(String name, String email, String place, String phone) {
	
		this.name = name;
		this.email = email;
		this.place = place;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
	
	
	
	
	
}
