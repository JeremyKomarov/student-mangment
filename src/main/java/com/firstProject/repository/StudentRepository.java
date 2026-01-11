package com.firstProject.repository;

import com.firstProject.model.Student;

import java.util.List;

public interface StudentRepository {
    Long createStudent(Student student);
    Student getStudentById(Long studentId);
    List<Student> getAllStudents();
}
