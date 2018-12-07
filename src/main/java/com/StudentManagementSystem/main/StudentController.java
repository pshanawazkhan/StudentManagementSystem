package com.StudentManagementSystem.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentManagementSystem.main.StudentEntity.Student;
import com.StudentManagementSystem.main.StudentModel.StudentModel;
import com.StudentManagementSystem.main.StudentRepository.StudentManagementRepository;

@RestController
@RequestMapping(value="student")
public class StudentController {

	@Autowired
	StudentManagementRepository smrepo;
	
	public String saveDetails( @RequestBody StudentModel sm) {
		
		Student stu = new Student();
		
		stu.setName(sm.getName());
		stu.setEmail(sm.getEmail());
		stu.setPlace(sm.getPlace());
		stu.setPhone(sm.getPhone());
		
		
		try {
		
		smrepo.save(stu);
		}
		catch(Exception e) {
			
			return "Student Details not Saved ";
		}
		return "Student Details saved";
	}
	
	
	
	
	
	
}
