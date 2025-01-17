package com.example.StudentProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentProject.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}