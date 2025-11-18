package com.firstProject.controller;

import com.firstProject.model.Student;
import com.firstProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/create")
    public void createStudent(@RequestBody Student student) {
        studentRepository.createStudent(student);
    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody Student student) {
        studentRepository.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentRepository.deleteStudent(id);
    }
}
