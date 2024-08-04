package com.example.StudentProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentProject.entity.Student;
import com.example.StudentProject.service.StudentService;

@RestController
@RequestMapping("/student/")
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("save")
	public Student save(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	
	@GetMapping("getall")
	public List<Student> getallStudent(){
		return service.getall();
	}
}