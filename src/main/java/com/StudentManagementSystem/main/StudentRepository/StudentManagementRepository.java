package com.StudentManagementSystem.main.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentManagementSystem.main.StudentEntity.Student;
import java.lang.String;
import java.util.List;

@Repository
public interface StudentManagementRepository  extends JpaRepository<Student, Integer> {

	
	
	
	
	List<Student> findByName(String name);
	
	
	
	
}
