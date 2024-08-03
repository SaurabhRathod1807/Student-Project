package com.example.StudentProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentProject.entity.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Long> {

}
