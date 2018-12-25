package com.StudentManagementSystem.main;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.StudentManagementSystem.main.StudentEntity.Student;
import com.StudentManagementSystem.main.StudentModel.StudentModel;
import com.StudentManagementSystem.main.StudentRepository.StudentManagementRepository;
import com.StudentManagementSystem.main.exceptions.StudentExceptions;

@RestController
@RequestMapping(value="student")
public class StudentController {

	@Autowired
	StudentManagementRepository smrepo;
	
	@PostMapping("save")
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
	@GetMapping("get")
	public List<Student> getDetails(){
		List<Student> l1 = new ArrayList<>();
		l1= smrepo.findAll();
		
		return l1;
	}
	@GetMapping("get/id")
	public Student getIdDetails( @PathParam("id")int id) {
		
		Student stu = smrepo.getOne(id );
		return stu;
	}
	@GetMapping("getname/{name}")
	public List<Student> getByName(@PathVariable  String name) throws StudentExceptions{
		
		List<Student> l1=null;
	
		l1= smrepo.findByName(name);
		if(l1.isEmpty()) {
		System.out.println("l1.isEmpty ---------->"+l1.isEmpty());
	
	
			
			throw new StudentExceptions("Student details name not found  "+name);
		}
		
		return l1;
	}
	
	
	
	
	
	
}
