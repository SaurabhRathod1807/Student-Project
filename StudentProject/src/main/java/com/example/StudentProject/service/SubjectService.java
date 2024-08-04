package com.example.StudentProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentProject.entity.Subject;
import com.example.StudentProject.repo.SubjectRepo;

@Service
public class SubjectService {

	@Autowired
	private SubjectRepo subjectRepo;
	
	public Subject save(Subject subject) {
		return subjectRepo.save(subject);
	}
	
	public List<Subject> getall(){
		return subjectRepo.findAll();
	}
}