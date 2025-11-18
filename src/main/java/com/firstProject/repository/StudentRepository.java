package com.firstProject.repository;

import com.firstProject.model.Student;

public interface StudentRepository {
    void createStudent (Student student);
    void updateStudent (Student student);
    void deleteStudent (Long id);
}
