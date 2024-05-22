package com.example.studentsystem.Service;

import com.example.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    List<Student> getAllStudents();
}
