package com.example.studentsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentsystem.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
