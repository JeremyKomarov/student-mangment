package com.firstProject.service;

import com.firstProject.model.Course;

import java.util.List;

public interface CourseService {
    Long createCourse(Course course);
    Course getCourseById(Long id);
    List<Course> getAllCourses();
}
