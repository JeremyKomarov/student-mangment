package com.firstProject.service;

import com.firstProject.model.Student;

import java.util.List;

public interface StudentService {
    Long createStudent(Student student);
    Student getStudentById(Long studentId);
    List<Student> getAllStudents();
}
