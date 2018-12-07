package com.StudentManagementSystem.main.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StudentManagementSystem.main.StudentEntity.Student;

@Repository
public interface StudentManagementRepository  extends JpaRepository<Student, Integer> {

}
