package com.example.StudentProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentProject.entity.Subject;
import com.example.StudentProject.repo.SubjectRepo;
import com.example.StudentProject.service.SubjectService;

@RestController
@RequestMapping("/subject/")
public class SubjectController {

	@Autowired
	private SubjectService service;
	
	@PostMapping("save")
	public Subject saveSubject(@RequestBody Subject subject) {
		return service.save(subject);
	}
	
	@GetMapping("getall")
	public List<Subject> getallSubject(){
		return service.getall();
	}
}