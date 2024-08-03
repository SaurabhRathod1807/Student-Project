package com.example.StudentProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentProject.entity.Student;
import com.example.StudentProject.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	public Student saveStudent(Student student) { 
		return studentRepo.save(student);
	}
	
	public List<Student> getall(){
		return studentRepo.findAll();
	}
}
